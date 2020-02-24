package com.jlt.main;

import java.util.Scanner;

import com.jlt.pojo.Account;
import com.jlt.pojo.Current;
import com.jlt.pojo.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		int choice;
		int amount;
		String continueChoice;
		int accountChoice;
		String salaryChoice;
		boolean isSalary = false;
		double overdraftBalance;

		Scanner scanner = new Scanner(System.in);
		Account account = null;

		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		System.out.println("Menu");
		System.out.println("1.. Savings");
		System.out.println("2.. Current");

		System.out.println("Enter your choice");
		accountChoice = scanner.nextInt();

		switch (accountChoice) {
		case 1:
			System.out.println("Do you want to open salary account ? yes || no");
			salaryChoice = scanner.next();
			if (salaryChoice.equals("yes"))
				isSalary = true;
			account = new Savings(name, balance, isSalary);
			break;
		case 2:
			System.out.println("Enter OverdraftBalance");
			overdraftBalance = scanner.nextDouble();
			account = new Current(name, balance, overdraftBalance);
		default:
			break;
		}

		System.out.println("Account Created Successfully");
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
				if (account.getClass() == Current.class) {
					Current current = (Current) account; 
					System.out.println("Balance :: " + current.getBalance());
					System.out.println("OverdraftBalance :: " + current.getOverdraftBalance());
				} else
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
