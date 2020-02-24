package com.jlt.pojo;

public class Current extends Account {

	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		System.out.println("Default Constructor Of Current");
	}

	public Current(String name, double balance, double overdraftBalance) {
		super(name, balance);
		this.initialOverdraftBalance = overdraftBalance;
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && amount > getBalance() && amount <= getBalance() + overdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftBalance = overdraftBalance - amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0 && initialOverdraftBalance > overdraftBalance) {
			if (amount > initialOverdraftBalance - overdraftBalance) {
				amount = amount - (initialOverdraftBalance - overdraftBalance);
				overdraftBalance = initialOverdraftBalance;
				setBalance(getBalance() + amount);
				return true;
			}
			overdraftBalance = overdraftBalance + amount;
			return true;
		}
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
