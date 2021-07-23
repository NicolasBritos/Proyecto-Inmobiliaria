/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.CronogramaPagos;
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
public class CronogramaPagosJpaController implements Serializable {

    public CronogramaPagosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public CronogramaPagosJpaController (){
        emf = Persistence.createEntityManagerFactory("FinalAvanzada2");
        
    }
    public void create(CronogramaPagos cronogramaPagos) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cronogramaPagos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCronogramaPagos(cronogramaPagos.getIdCronograma()) != null) {
                throw new PreexistingEntityException("CronogramaPagos " + cronogramaPagos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CronogramaPagos cronogramaPagos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cronogramaPagos = em.merge(cronogramaPagos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cronogramaPagos.getIdCronograma();
                if (findCronogramaPagos(id) == null) {
                    throw new NonexistentEntityException("The cronogramaPagos with id " + id + " no longer exists.");
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
            CronogramaPagos cronogramaPagos;
            try {
                cronogramaPagos = em.getReference(CronogramaPagos.class, id);
                cronogramaPagos.getIdCronograma();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cronogramaPagos with id " + id + " no longer exists.", enfe);
            }
            em.remove(cronogramaPagos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CronogramaPagos> findCronogramaPagosEntities() {
        return findCronogramaPagosEntities(true, -1, -1);
    }

    public List<CronogramaPagos> findCronogramaPagosEntities(int maxResults, int firstResult) {
        return findCronogramaPagosEntities(false, maxResults, firstResult);
    }

    private List<CronogramaPagos> findCronogramaPagosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CronogramaPagos.class));
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

    public CronogramaPagos findCronogramaPagos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CronogramaPagos.class, id);
        } finally {
            em.close();
        }
    }

    public int getCronogramaPagosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CronogramaPagos> rt = cq.from(CronogramaPagos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
