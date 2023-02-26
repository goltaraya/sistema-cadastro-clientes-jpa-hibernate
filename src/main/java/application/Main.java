package application;

import java.sql.SQLException;
import java.util.Scanner;

import model.Client;
import service.ClientService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os seguintes dados:");
		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.println("Bairro: ");
		String address = sc.nextLine();

		System.out.println("Celular: ");
		String phoneNumber = sc.nextLine();

		System.out.println("Email: ");
		String email = sc.nextLine();

		System.out.println("Formatando dados...");

		Client client = new Client(null, name, address, phoneNumber, email);
		ClientService rc = new ClientService();

		try {
			rc.register(client);
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}

		System.out.println("Cliente " + client.getName() + " inserido no sistema com sucesso!");
	}
}
