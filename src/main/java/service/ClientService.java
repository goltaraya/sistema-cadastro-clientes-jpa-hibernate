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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Client client) {
		// TODO Auto-generated method stub

	}

}
