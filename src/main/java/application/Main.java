package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Client;

public class Main {
	public static void main(String[] args) {
		Client clienteTeste = new Client(null, "Ciro", "New York", "98918374625", "cro@mail");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistema-cliente");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(clienteTeste);
		em.getTransaction().commit();
	}
}
