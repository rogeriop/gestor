package br.com.arptec.gestor.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gestor-hsqldb");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();

	}
}
