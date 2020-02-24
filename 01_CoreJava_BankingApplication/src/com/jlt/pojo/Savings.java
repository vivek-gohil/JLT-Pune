package com.jlt.pojo;

public class Savings extends Account {
	private boolean isSalary;

	public Savings() {
		System.out.println("Default Constructor Of Savings");
	}

	public Savings(String name, double balance, boolean isSalary) {
		super(name, balance);
		this.isSalary = isSalary;
		System.out.println("Param. Constructor Of Savings");
	}
	public boolean withdraw(double amount) {
		if (isSalary) {
			if (amount > 0 && amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			return false;
		}
		if (amount > 0 && getBalance() - amount >= 1500) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "Savings [isSalary=" + isSalary + ", toString()=" + super.toString() + "]";
	}

}
