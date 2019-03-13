package model.DAOs;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import model.DTOs.Cliente;
import singleton.EManager;


public class ClienteDAO {
	private static EntityManager em;
	static final Logger logger = Logger.getLogger(ClienteDAO.class);
	public ClienteDAO() {
		em = EManager.getEm();
	}

	public boolean insertar(Cliente cliente) {
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			Logger.getLogger(getClass()).log(Level.INFO, "Cliente agregado correctamente");
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

	public Cliente consultar(String id) {
		Cliente auto = em.find(Cliente.class, id);
		Logger.getLogger(getClass()).log(Level.INFO, "Se ha consultado el cliente con id: "+ id);
		return auto;
	}

	public List<Cliente> selectall() {
		List<Cliente> ciudades = em.createQuery("SELECT c FROM Auto c ORDER BY c.idAuto", Cliente.class)
				.getResultList();
		Logger.getLogger(getClass()).log(Level.INFO, "Se ha consultado toda la lista de clientes");
		return ciudades;
	}
}
