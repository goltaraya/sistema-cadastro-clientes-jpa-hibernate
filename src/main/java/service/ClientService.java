package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Client;

public class ClientService implements ClientServiceInterface {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistema-cliente");
	EntityManager em = emf.createEntityManager();

	@Override
	public void register(Client client) {
		this.em.getTransaction().begin();
		this.em.persist(client);
		this.em.getTransaction().commit();
	}

	@Override
	public Client getById(Integer id) {
		Client client = this.em.find(Client.class, id);
		if (client == null) {
			return null;
		}
		return client;
	}

	@Override
	public List<Client> getAll() {
		this.em.getTransaction().begin();
		String qlString = "SELECT c FROM Client c";
		@SuppressWarnings("unchecked")
		List<Client> clientsList = this.em.createQuery(qlString).getResultList();
		this.em.getTransaction().commit();
		return clientsList;
	}

	@Override
	public void remove(Client client) {
		this.em.getTransaction().begin();
		this.em.remove(client);
		this.em.getTransaction().commit();
	}

}
