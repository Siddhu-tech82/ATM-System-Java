package com.vcube.projects;

import java.util.Scanner;

public class AtmMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		User[] users = {

				new User(8850, "Siddhu", 2123, 8000),

				new User(2212, "Bharath", 3344, 58000),

				new User(1234, "Arun", 2345, 9000),

				new User(2381, "Rohith", 2004, 6000)

		};

		User loggedInUser = login(users, sc);

		if (loggedInUser == null) {

			System.out.println("Account Blocked.");

			sc.close();

			return;

		}

		System.out.println("\nWelcome " + loggedInUser.getAccountHolderName());

		AtmSystem atm = new AtmSystem(loggedInUser, sc);

		int choice;

		do {

			System.out.println("\n========================================");
			System.err.println("WELCOME TO UNION BANK ATM SERVICES 🤝🤝");
			System.out.println("==========================================");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Change PIN");
			System.out.println("5. Transaction History");
			System.out.println("6. Exit");
			System.out.println("===========================================");

			System.out.print("Enter Choice : ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				atm.checkBalance();
				break;

			case 2:
				atm.deposit();
				break;

			case 3:
				atm.withdraw();
				break;

			case 4:
				atm.changePin();
				break;

			case 5:
				atm.transactionHistory();
				break;

			case 6:
				System.err.println("Thank You For Using Union Bank ATM 🤝.");
				break;

			default:
				System.out.println("Invalid Choice.");

			}

		} while (choice != 6);

		sc.close();

	}

	public static User login(User[] users, Scanner sc) {

		final int MAX_ATTEMPTS = 3;

		int attempts = 0;

		while (attempts < MAX_ATTEMPTS) {

			System.out.println("\n===== LOGIN =====");

			System.out.print("Account Number : ");

			int accountNumber = sc.nextInt();

			System.out.print("PIN : ");

			int pin = sc.nextInt();

			for (User user : users) {

				if (user.getAccountNumber() == accountNumber && user.getPin() == pin) {

					return user;

				}

			}

			attempts++;

			System.out.println("Invalid Credentials.");

			System.out.println("Attempts Left : " + (MAX_ATTEMPTS - attempts));

		}

		return null;

	}

}