package br.com.aluraJavaJPA01.teste;

import javax.persistence.EntityManager;

import br.com.aluraJavaJPA01.modelo.Conta;
import br.com.aluraJavaJPA01.util.JPAUtil;

public class ContaTeste {
  public static void main(String[] args) {
	  Conta conta = new Conta("Maria 1","1","Caixa Economica","1");
	  
	  
	  EntityManager em = JPAUtil.getEntityManager();
	  
	  em.getTransaction().begin();
	  em.persist(conta);
	  em.getTransaction().commit();
	  
	  em.close();
	  JPAUtil.finalizaEntityManagerFactory();
  }
}
