package com.jlt.main;

import com.jlt.pojo.Current;

public class AccountMainV5 {
	public static void main(String[] args) {

		Current current = new Current("Vivek Gohil", 10000, 50000);
		System.out.println(current);
		System.out.println("--------------------------------------------------");
		current.withdraw(5000);
		System.out.println("after withdraw(5000)");
		System.out.println(current);
		// balance = 5000 and overdraftBalance = 50000

		System.out.println("----------------------------");
		current.withdraw(15000);
		System.out.println(current);
		// balance = 0 and overdraftBalance = 40000

		System.out.println("----------------------------");
		current.deposit(5000);
		System.out.println(current);
		// balance = 0 and overdraftBalance = 45000

		System.out.println("----------------------------");
		current.deposit(15000);
		System.out.println(current);
		// balance = 10000 and overdraftBalance = 50000

		System.out.println("----------------------------");

	}
}
