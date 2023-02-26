package service;

import java.util.List;
import java.util.Scanner;

import model.Client;

public class MenuService implements MenuServiceInterface {
	Scanner sc = new Scanner(System.in);
	ClientService cs = new ClientService();

	@Override
	public void showMenu() {
		System.out.println("===== MENU =====");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Buscar cliente");
		System.out.println("3 - Mostrar todos os clientes");
		System.out.println("4 - Remover cliente");
	}

	@Override
	public void registerClient() {
		System.out.println("Insira os seguintes dados:");
		System.out.print("Nome completo: ");
		String name = sc.nextLine();

		System.out.print("Endereço (Ex.: Bairro, Cidade, Estado): ");
		String address = sc.nextLine();

		System.out.print("DDD + Celular: ");
		String phoneNumber = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.println("Formatando dados...");

		Client client = new Client(null, name, address, phoneNumber, email);

		try {
			cs.register(client);
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}

		System.out.println("Cliente " + client.getName() + " inserido no sistema com sucesso!");
	}

	@Override
	public void getClientById() {
		System.out.print("Insira o ID do cliente que deseja buscar: ");
		int id = sc.nextInt();
		Client client = cs.getById(id);
		if (client == null) {
			System.out.println("Não foi possível encontrar o cliente de ID " + id);
		} else {
			System.out.println("Cliente encontrado!\n" + client);
		}
	}

	@Override
	public void getAllClients() {
		List<Client> clients = cs.getAll();
		System.out.println("Total de clientes encontrados no banco de dados: " + clients.size());
		if (clients.size() > 0) {
			for (Client client : clients) {
				System.out.println(client);
			}
		} else {
			System.out.println("Ainda não existe clientes cadastrados no sistema...");
		}
	}

	@Override
	public void removeClient() {
		System.out.print("Insira o ID do cliente que você deseja remover: ");
		int id = sc.nextInt();
		Client client = cs.getById(id);
		cs.remove(client);
		System.out.println("Cliente " + client.getName() + " excluído com sucesso!");
	}

}
