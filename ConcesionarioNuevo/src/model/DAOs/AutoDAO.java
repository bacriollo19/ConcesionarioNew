package model.DAOs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.DTOs.Auto;

public class AutoDAO {
	private static final String PERSISTENCE_UNIT_NAME = "concesionarios";
	private static EntityManagerFactory factory;
	private EntityManager em;

	public AutoDAO() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
	}

	public boolean insertar(Auto auto) {
		try {
			em.getTransaction().begin();
			em.persist(auto);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			em.close();
			return false;
		}
		em.close();
		return true;
	}

	public Auto consultar(String id) {
		Auto auto = em.find(Auto.class, id);
		return auto;
	}

	public List<Auto> selectall() {
		List<Auto> ciudades = em.createQuery("SELECT c FROM Auto c ORDER BY c.idAuto", Auto.class).getResultList();
		em.close();
		return ciudades;
	}
}
