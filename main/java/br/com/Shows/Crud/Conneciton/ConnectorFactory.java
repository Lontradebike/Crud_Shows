package br.com.Shows.Crud.Conneciton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectorFactory {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Bandas");
	
public EntityManager getConnection() {
	return emf.createEntityManager();
	
}
}
