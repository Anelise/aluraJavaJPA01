package br.com.aluraJavaJPA01.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public static void finalizaEntityManagerFactory() {
		emf.close();
	}

}
