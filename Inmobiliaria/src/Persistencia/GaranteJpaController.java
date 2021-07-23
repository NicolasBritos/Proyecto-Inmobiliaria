/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Garante;
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
public class GaranteJpaController implements Serializable {

    public GaranteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public GaranteJpaController (){
        emf = Persistence.createEntityManagerFactory("FinalAvanzada2");
        
    }

    public void create(Garante garante) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(garante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findGarante(garante.getDni()) != null) {
                throw new PreexistingEntityException("Garante " + garante + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Garante garante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            garante = em.merge(garante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = garante.getDni();
                if (findGarante(id) == null) {
                    throw new NonexistentEntityException("The garante with id " + id + " no longer exists.");
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
            Garante garante;
            try {
                garante = em.getReference(Garante.class, id);
                garante.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The garante with id " + id + " no longer exists.", enfe);
            }
            em.remove(garante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Garante> findGaranteEntities() {
        return findGaranteEntities(true, -1, -1);
    }

    public List<Garante> findGaranteEntities(int maxResults, int firstResult) {
        return findGaranteEntities(false, maxResults, firstResult);
    }

    private List<Garante> findGaranteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Garante.class));
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

    public Garante findGarante(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Garante.class, id);
        } finally {
            em.close();
        }
    }

    public int getGaranteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Garante> rt = cq.from(Garante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
