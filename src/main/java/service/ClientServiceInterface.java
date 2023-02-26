package service;

import java.util.List;

import model.Client;

public interface ClientServiceInterface {
	public void register(Client client);

	public Client getById(Integer id);

	public List<Client> getAll();

	public void remove(Client client);
}
