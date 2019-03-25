package org.taller.model.DAOs;

import java.util.List;
import javax.persistence.EntityManager;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.taller.model.DTOs.Auto;
import org.taller.singleton.EManager;

public class AutoDAO {
	private static EntityManager em;
	static final Logger logger = Logger.getLogger(AutoDAO.class);
	public AutoDAO() {
		em = EManager.getEm();
	}

	public boolean insertar(Auto auto) {
		try {
			em.getTransaction().begin();
			em.persist(auto);
			em.getTransaction().commit();
			Logger.getLogger(getClass()).log(Level.INFO, "Auto agregado correctamente");
		} catch (Exception e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(getClass()).log(Level.ERROR,"Error when saving 'Auto' in Database EXCEPTION STRING: {0}"+ e.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE,"EXCEPTION STRING: {0}"+e.toString());
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.ERROR,
					"Error when saving 'Auto' in Database  THROWABLE MESSAGE: {0}" + th.toString());
			return false;
		}
		return true;
	}

	public Auto consultar(String id) {
		Auto auto = em.find(Auto.class, id);
		Logger.getLogger(getClass()).log(Level.INFO, "Se ha consultado el auto con id: "+ id);
		return auto;
	}

	public List<Auto> selectall() {
		List<Auto> ciudades = em.createQuery("SELECT c FROM Auto c ORDER BY c.idAuto", Auto.class).getResultList();
		Logger.getLogger(getClass()).log(Level.INFO, "Se ha consultado toda la lista de autos");
		return ciudades;
	}
}
