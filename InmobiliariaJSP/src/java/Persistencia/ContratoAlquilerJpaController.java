/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.ContratoAlquiler;
import Persistencia.exceptions.NonexistentEntityException;
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
public class ContratoAlquilerJpaController implements Serializable {

    public ContratoAlquilerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
public ContratoAlquilerJpaController() {
     emf = Persistence.createEntityManagerFactory("WEBPU");
}

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ContratoAlquiler contratoAlquiler) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contratoAlquiler);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ContratoAlquiler contratoAlquiler) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            contratoAlquiler = em.merge(contratoAlquiler);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = contratoAlquiler.getIdContrato();
                if (findContratoAlquiler(id) == null) {
                    throw new NonexistentEntityException("The contratoAlquiler with id " + id + " no longer exists.");
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
            ContratoAlquiler contratoAlquiler;
            try {
                contratoAlquiler = em.getReference(ContratoAlquiler.class, id);
                contratoAlquiler.getIdContrato();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The contratoAlquiler with id " + id + " no longer exists.", enfe);
            }
            em.remove(contratoAlquiler);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ContratoAlquiler> findContratoAlquilerEntities() {
        return findContratoAlquilerEntities(true, -1, -1);
    }

    public List<ContratoAlquiler> findContratoAlquilerEntities(int maxResults, int firstResult) {
        return findContratoAlquilerEntities(false, maxResults, firstResult);
    }

    private List<ContratoAlquiler> findContratoAlquilerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ContratoAlquiler.class));
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

    public ContratoAlquiler findContratoAlquiler(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ContratoAlquiler.class, id);
        } finally {
            em.close();
        }
    }

    public int getContratoAlquilerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ContratoAlquiler> rt = cq.from(ContratoAlquiler.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
