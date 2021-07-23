/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Locador;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Britos
 */
public class LocadorJpaController implements Serializable {

    public LocadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public LocadorJpaController (){
        emf = Persistence.createEntityManagerFactory("FinalAvanzada2");
        
    }

    public void create(Locador locador) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(locador);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLocador(locador.getDni()) != null) {
                throw new PreexistingEntityException("Locador " + locador + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Locador locador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            locador = em.merge(locador);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = locador.getDni();
                if (findLocador(id) == null) {
                    throw new NonexistentEntityException("The locador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Locador locador;
            try {
                locador = em.getReference(Locador.class, id);
                locador.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The locador with id " + id + " no longer exists.", enfe);
            }
            em.remove(locador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Locador> findLocadorEntities() {
        return findLocadorEntities(true, -1, -1);
    }

    public List<Locador> findLocadorEntities(int maxResults, int firstResult) {
        return findLocadorEntities(false, maxResults, firstResult);
    }

    private List<Locador> findLocadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Locador.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Locador findLocador(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Locador.class, id);
        } finally {
            em.close();
        }
    }

    public int getLocadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Locador> rt = cq.from(Locador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
