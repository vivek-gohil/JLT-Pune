package com.jlt.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	private Set<String> nameSet = new HashSet<String>();

	public void printSet() {
		nameSet.add("AAB");
		nameSet.add("VIVEK");
		nameSet.add("PRIYA");
		nameSet.add("PRIYANKA");
		nameSet.add("REEMA");

		System.out.println(nameSet);

		for (String temp : nameSet) {
			System.out.println("Value :: " + temp + " HashCode :: " + temp.hashCode());
		}
	}
}
