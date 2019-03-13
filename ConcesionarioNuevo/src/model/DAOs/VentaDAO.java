package model.DAOs;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import model.DTOs.Venta;
import singleton.EManager;

public class VentaDAO {
	private static EntityManager em;
	static final Logger logger = Logger.getLogger(VentaDAO.class);
	public VentaDAO() {
		em = EManager.getEm();
	}

	public boolean insertar(Venta venta) {
		try {
			em.getTransaction().begin();
			em.persist(venta);
			em.getTransaction().commit();
			Logger.getLogger(getClass()).log(Level.INFO, "Venta registrada correctamente");
		} catch (Exception e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(getClass()).log(Level.ERROR,"Error when saving 'Cliente' in Database EXCEPTION STRING: {0}"+ e.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE,"EXCEPTION STRING: {0}"+e.toString());
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
					"Error when saving 'Cliente' in Database  THROWABLE MESSAGE: {0}" + th.toString());
			return false;
		}
		return true;
	}

	public Venta consultar(String id) {
		Venta venta = em.find(Venta.class, id);
		Logger.getLogger(getClass()).log(Level.INFO, "Se ha consultado la venta con id: "+ id);
		return venta;
	}

	public List<Venta> selectall() {
		List<Venta> ciudades = em.createQuery("SELECT c FROM Auto c ORDER BY c.idAuto", Venta.class).getResultList();
		Logger.getLogger(getClass()).log(Level.INFO, "Se ha consultado toda el registro de ventas");
		return ciudades;
	}
}
