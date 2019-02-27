package model.DAOs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.DTOs.Venta;

public class VentaDAO {
	private static final String PERSISTENCE_UNIT_NAME = "concesionarios";
	private static EntityManagerFactory factory;
	private EntityManager em;

	public VentaDAO() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
	}

	public boolean insertar(Venta venta) {
		try {
			em.getTransaction().begin();
			em.persist(venta);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			em.close();
			return false;
		}
		em.close();
		return true;
	}

	public Venta consultar(String id) {
		Venta venta = em.find(Venta.class, id);
		return venta;
	}

	public List<Venta> selectall() {
		List<Venta> ciudades = em.createQuery("SELECT c FROM Auto c ORDER BY c.idAuto", Venta.class).getResultList();
		em.close();
		return ciudades;
	}
}
