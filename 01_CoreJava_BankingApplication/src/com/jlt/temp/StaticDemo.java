package com.jlt.temp;

public class StaticDemo {

	private static int num1 = 10;
	private int num2;

	public StaticDemo() {
		// num1 = 10;
		num2 = 10;
	}

	public void display() {
		System.out.println("Num1 :: " + num1);
		System.out.println("Num2 :: " + num2);

		num1 += 10;
		num2 += 10;

		System.out.println("Num1 :: " + num1);
		System.out.println("Num2 :: " + num2);

	}

	public static void main(String[] args) {

		StaticDemo demo = new StaticDemo();
		demo.display();// 10 10 20 20
		System.out.println("-------------------------------------");
		StaticDemo demo1 = new StaticDemo();
		demo1.display(); // 20 20 30 30
		// new object // 10 10 20 20
	}

	@Override
	public String toString() {
		return "StaticDemo [num1 = " + num1 + " num2=" + num2 + " ]";
	}

}
