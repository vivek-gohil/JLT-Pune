package com.jlt.main;

import com.jlt.pojo.Account;

public class AccountMainV3 {
	public static void main(String[] args) {
		Account account1 = new Account("Test 1", 10000);

		Account account2 = new Account("Test 2", 10000);

		Account account3 = new Account("Test 3", 10000);

		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
	}
}
