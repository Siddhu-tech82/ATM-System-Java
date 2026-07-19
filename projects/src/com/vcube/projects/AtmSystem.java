package com.vcube.projects;

import java.util.Scanner;

public class AtmSystem implements AtmInterface {

	private User user;
	private Scanner sc;

	public AtmSystem(User user, Scanner sc) {
		this.user = user;
		this.sc = sc;
	}

	@Override
	public void checkBalance() {

		System.out.printf("Current Balance : ₹%.2f%n", user.getBalance());

	}

	@Override
	public void deposit() {

		System.out.print("Enter Amount : ");

		double amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("Invalid Amount");
			return;
		}

		user.deposit(amount);

		user.addTransaction("Deposited ₹" + amount);

		System.out.println("Amount Deposited Successfully.");

	}

	@Override
	public void withdraw() {

		System.out.print("Enter Amount : ");

		double amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("Invalid Amount");
			return;
		}

		if (amount % 100 != 0) {
			System.out.println("Amount should be multiple of 100.");
			return;
		}

		if (amount > user.getBalance()) {
			System.out.println("Insufficient Balance.");
			return;
		}

		user.withdraw(amount);

		user.addTransaction("Withdrawn ₹" + amount);

		System.out.println("Please Collect Your Cash.");

	}

	@Override
	public void changePin() {

		System.out.print("Enter Old PIN : ");

		int oldPin = sc.nextInt();

		if (oldPin != user.getPin()) {
			System.out.println("Wrong PIN");
			return;
		}

		System.out.print("Enter New 4-digit PIN : ");

		int newPin = sc.nextInt();

		if (newPin < 1000 || newPin > 9999) {
			System.out.println("PIN should contain 4 digits.");
			return;
		}

		user.setPin(newPin);

		user.addTransaction("PIN Changed");

		System.out.println("PIN Changed Successfully.");

	}

	@Override
	public void transactionHistory() {

		System.out.println("\n------ Transaction History ------");

		if (user.getTransactionHistory().isEmpty()) {

			System.out.println("No Transactions.");

		} else {

			for (String transaction : user.getTransactionHistory()) {

				System.out.println(transaction);

			}

		}

	}

}