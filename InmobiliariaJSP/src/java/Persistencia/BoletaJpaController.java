/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Boleta;
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
public class BoletaJpaController implements Serializable {

    public BoletaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

        public BoletaJpaController (){
        emf = Persistence.createEntityManagerFactory("WEBPU");
            }
        
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Boleta boleta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(boleta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Boleta boleta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            boleta = em.merge(boleta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = boleta.getIdBoleta();
                if (findBoleta(id) == null) {
                    throw new NonexistentEntityException("The boleta with id " + id + " no longer exists.");
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
            Boleta boleta;
            try {
                boleta = em.getReference(Boleta.class, id);
                boleta.getIdBoleta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The boleta with id " + id + " no longer exists.", enfe);
            }
            em.remove(boleta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Boleta> findBoletaEntities() {
        return findBoletaEntities(true, -1, -1);
    }

    public List<Boleta> findBoletaEntities(int maxResults, int firstResult) {
        return findBoletaEntities(false, maxResults, firstResult);
    }

    private List<Boleta> findBoletaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Boleta.class));
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

    public Boleta findBoleta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Boleta.class, id);
        } finally {
            em.close();
        }
    }

    public int getBoletaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Boleta> rt = cq.from(Boleta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
