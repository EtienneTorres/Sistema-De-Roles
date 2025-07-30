
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Rol;
import persistencia.exceptions.NonexistentEntityException;


public class RolJpaController implements Serializable {
    
     public RolJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public RolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Rol rol) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(rol);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            rol = em.merge(rol);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findRol(rol.getId()) == null) {
                throw new NonexistentEntityException("El rol con id " + rol.getId() + " no existe.");
            }
            throw ex;
        } finally {
            em.close();
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Rol rol = em.getReference(Rol.class, id);
            rol.getId(); // para forzar la carga
            em.remove(rol);
            em.getTransaction().commit();
        } catch (EntityNotFoundException enfe) {
            throw new NonexistentEntityException("El rol con id " + id + " no existe.", enfe);
        } finally {
            em.close();
        }
    }

    public Rol findRol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            em.close();
        }
    }

    public List<Rol> findRolEntities() {
        return findRolEntities(true, -1, -1);
    }

    public List<Rol> findRolEntities(int maxResults, int firstResult) {
        return findRolEntities(false, maxResults, firstResult);
    }

    private List<Rol> findRolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rol.class));
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

    public int getRolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rol> rt = cq.from(Rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
