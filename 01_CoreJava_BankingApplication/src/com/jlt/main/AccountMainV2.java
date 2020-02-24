package com.jlt.main;

import java.util.Scanner;

import com.jlt.pojo.Account;

public class AccountMainV2 {

	public static void main(String[] args) {

		int accountNumber;
		String name;
		double balance;
		int choice;
		int amount;
		String continueChoice;

		Scanner scanner = new Scanner(System.in);
		Account account;

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		account = new Account(accountNumber, name, balance);

		System.out.println("Accout Created Successfully");
		System.out.println(account);
		do {
			System.out.println("Menu");
			System.out.println("1.. Withdraw");
			System.out.println("2.. Deposit");
			System.out.println("3.. Display Balance");

			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Amount");
				amount = scanner.nextInt();
				if (account.withdraw(amount))
					System.out.println("Transaction Success !!");
				else
					System.out.println("Transaction Failed !!");
				break;
			case 2:
				System.out.println("Enter Amount");
				amount = scanner.nextInt();
				if (account.deposit(amount))
					System.out.println("Transaction Success !!");
				else
					System.out.println("Transaction Failed !!");
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue ? yes || no ");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
	}
}
