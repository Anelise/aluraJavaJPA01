package br.com.aluraJavaJPA01.teste;

import javax.persistence.EntityManager;

import br.com.aluraJavaJPA01.modelo.Conta;
import br.com.aluraJavaJPA01.util.JPAUtil;

public class TesteBuscaConta {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class,3);
		
		System.out.println("Aquiii....."+conta.getTitular());
		
		em.getTransaction().commit();
	}	

}
