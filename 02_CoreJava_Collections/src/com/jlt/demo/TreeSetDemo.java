package com.jlt.demo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	private Set<String> nameSet = new TreeSet<String>();

	public void display() {
		nameSet.add("z");
		nameSet.add("d");
		nameSet.add("c");
		nameSet.add("f");
		nameSet.add("b");
		nameSet.add("a");
		nameSet.add("z");
		nameSet.add("Z");
		nameSet.add("D");
		nameSet.add("C");
		nameSet.add("F");
		nameSet.add("B");
		nameSet.add("A");

		System.out.println(nameSet);
	}
}
