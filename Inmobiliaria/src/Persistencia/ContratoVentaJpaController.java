/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.ContratoVenta;
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
public class ContratoVentaJpaController implements Serializable {

    public ContratoVentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public ContratoVentaJpaController (){
        emf = Persistence.createEntityManagerFactory("FinalAvanzada2");
        
    }

    public void create(ContratoVenta contratoVenta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contratoVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findContratoVenta(contratoVenta.getIdContrato()) != null) {
                throw new PreexistingEntityException("ContratoVenta " + contratoVenta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ContratoVenta contratoVenta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            contratoVenta = em.merge(contratoVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = contratoVenta.getIdContrato();
                if (findContratoVenta(id) == null) {
                    throw new NonexistentEntityException("The contratoVenta with id " + id + " no longer exists.");
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
            ContratoVenta contratoVenta;
            try {
                contratoVenta = em.getReference(ContratoVenta.class, id);
                contratoVenta.getIdContrato();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The contratoVenta with id " + id + " no longer exists.", enfe);
            }
            em.remove(contratoVenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ContratoVenta> findContratoVentaEntities() {
        return findContratoVentaEntities(true, -1, -1);
    }

    public List<ContratoVenta> findContratoVentaEntities(int maxResults, int firstResult) {
        return findContratoVentaEntities(false, maxResults, firstResult);
    }

    private List<ContratoVenta> findContratoVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ContratoVenta.class));
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

    public ContratoVenta findContratoVenta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ContratoVenta.class, id);
        } finally {
            em.close();
        }
    }

    public int getContratoVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ContratoVenta> rt = cq.from(ContratoVenta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
