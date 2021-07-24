/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Locatario;
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
public class LocatarioJpaController implements Serializable {

    public LocatarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
 public LocatarioJpaController() {
     emf = Persistence.createEntityManagerFactory("WEBPU");
}
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Locatario locatario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(locatario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLocatario(locatario.getDni()) != null) {
                throw new PreexistingEntityException("Locatario " + locatario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Locatario locatario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            locatario = em.merge(locatario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = locatario.getDni();
                if (findLocatario(id) == null) {
                    throw new NonexistentEntityException("The locatario with id " + id + " no longer exists.");
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
            Locatario locatario;
            try {
                locatario = em.getReference(Locatario.class, id);
                locatario.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The locatario with id " + id + " no longer exists.", enfe);
            }
            em.remove(locatario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Locatario> findLocatarioEntities() {
        return findLocatarioEntities(true, -1, -1);
    }

    public List<Locatario> findLocatarioEntities(int maxResults, int firstResult) {
        return findLocatarioEntities(false, maxResults, firstResult);
    }

    private List<Locatario> findLocatarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Locatario.class));
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

    public Locatario findLocatario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Locatario.class, id);
        } finally {
            em.close();
        }
    }

    public int getLocatarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Locatario> rt = cq.from(Locatario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
