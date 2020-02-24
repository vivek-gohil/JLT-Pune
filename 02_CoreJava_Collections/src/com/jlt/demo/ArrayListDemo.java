package com.jlt.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	// private List<String> nameList = new ArrayList<String>();
	private ArrayList<String> nameList = new ArrayList<String>();

	public void print() {
		System.out.println("Size :: " + nameList.size());

		nameList.add("Samiksha");
		nameList.add("Swapnali");
		nameList.add("Shaily");
		nameList.add("Swapnali");
		nameList.add("Praful");
		nameList.add("Swapnil");
		nameList.add("Samiksha");

		System.out.println("Size :: " + nameList.size());
		System.out.println(nameList);

		nameList.remove("Shaily");
		System.out.println(nameList);

	}

}
