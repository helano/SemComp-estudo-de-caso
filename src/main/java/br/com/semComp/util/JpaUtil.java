package br.com.semComp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("SemComp");

	}

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
