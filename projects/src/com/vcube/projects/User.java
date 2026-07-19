package com.vcube.projects;

import java.util.ArrayList;

public class User {

	private int accountNumber;
	private String accountHolderName;
	private int pin;
	private double balance;
	private ArrayList<String> transactionHistory;

	public User(int accountNumber, String accountHolderName, int pin, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.balance = balance;
		transactionHistory = new ArrayList<>();
		transactionHistory.add("Account Created with Balance ₹" + balance);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void addTransaction(String transaction) {
		transactionHistory.add(transaction);
	}

	public ArrayList<String> getTransactionHistory() {
		return transactionHistory;
	}

}