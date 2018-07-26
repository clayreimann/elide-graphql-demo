package com.axelor.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.yahoo.elide.standalone.ElideStandalone;

public class Main {
	public static void main(String[] args) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("graphql-pu");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		ElideStandalone app = new ElideStandalone(new Settings());
		app.start();

	}
}
