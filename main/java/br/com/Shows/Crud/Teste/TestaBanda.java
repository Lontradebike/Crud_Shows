package br.com.Shows.Crud.Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.Shows.Crud.Conneciton.ConnectorFactory;
import br.com.Shows.Crud.Model.Banda;

public class TestaBanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banda banda = new Banda();
		banda.setNome("farber");
		
		EntityManager em = new ConnectorFactory() .getConnection();
		
		em.getTransaction() .begin();
		em.persist(banda);
		em.getTransaction() .commit();
		em.close();
		
		
		
		
		
		
	}

}
