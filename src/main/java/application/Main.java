package application;

import java.util.Scanner;

import service.MenuService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuService menu = new MenuService();

		boolean exitLoop = false;
		int option = 0;
		while (exitLoop != true) {
			menu.showMenu();
			option = sc.nextInt();
			switch (option) {
			case 1:
				menu.registerClient();
				break;

			case 2:
				menu.getClientById();
				break;

			case 3:
				menu.getAllClients();
				break;

			case 4:
				menu.removeClient();
				break;
			case 9:
				exitLoop = true;
				break;
			}

		}

		sc.close();
	}
}
