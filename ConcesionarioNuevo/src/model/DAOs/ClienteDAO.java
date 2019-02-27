package model.DAOs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.DTOs.Cliente;


public class ClienteDAO {
	private static final String PERSISTENCE_UNIT_NAME = "concesionarios";
	private static EntityManagerFactory factory;
	private EntityManager em;

	public ClienteDAO() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
	}

	public boolean insertar(Cliente cliente) {
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			em.close();
			return false;
		}
		em.close();
		return true;
	}

	public Cliente consultar(String id) {
		Cliente auto = em.find(Cliente.class, id);
		return auto;
	}

	public List<Cliente> selectall() {
		List<Cliente> ciudades = em.createQuery("SELECT c FROM Auto c ORDER BY c.idAuto", Cliente.class).getResultList();
		em.close();
		return ciudades;
	}
}
