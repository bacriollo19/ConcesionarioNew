package org.taller.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class EManager {
	private static final String PERSISTENCE_UNIT_NAME = "concesionarios";
	private static EntityManagerFactory factory;
	private static EntityManager em;
	static final Logger logger = Logger.getLogger(EManager.class);

	public static EntityManager getEm() {
		try {
			if (em == null) {
				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				em = factory.createEntityManager();
			}
			return em;
		} catch (PersistenceException e) {
			Logger.getLogger(EManager.class).log(Level.FATAL,
					"Error al intentar crear el Entity Manager EXCEPTION STRING: {0}" + e.getMessage());
		}
		return em;
	}

}
