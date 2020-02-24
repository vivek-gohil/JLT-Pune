package com.jlt.demo;

import java.util.TreeMap;

public class TreeMapDemo {
	private TreeMap<Integer, String> userMap = new TreeMap<Integer, String>();

	public void print() {
		userMap.put(102, "Seema");
		userMap.put(101, "Seema");
		userMap.put(99, "Pooja");
		userMap.put(103, "Reema");
		userMap.put(null, null);

		System.out.println(userMap);
	}
}
