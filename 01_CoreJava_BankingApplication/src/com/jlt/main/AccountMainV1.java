package com.jlt.main;

import com.jlt.pojo.Account;

public class AccountMainV1 {
	public static void main(String[] args) {
		System.out.println("We are in main");
		Account account;
		account = new Account();
		System.out.println(account);
		System.out.println(account.hashCode());
		System.out.println("--------------------------------");
		account = new Account(101, "Vivek Gohil", 1000);
		System.out.println(account);
		System.out.println(account.hashCode());
		System.out.println("--------------------------------");
		System.out.println(account);
		System.out.println(account.hashCode());
		System.out.println("--------------------------------");
		Account account2 = account;
		System.out.println(account2);// same values
		System.out.println(account2.hashCode()); // same HashCode
		account2.setName("Test Name");
		System.out.println(account2); // 101 Test Name 1000
		System.out.println("--------------------------------");
		System.out.println(account); // 101 Test Name 1000
		System.out.println(account.hashCode()); // Same HashCode
		System.out.println("--------------------------------");
		account = new Account(102, "XYZ", 1000);
		System.out.println(account);
		System.out.println("main ends !!");
	}
}
