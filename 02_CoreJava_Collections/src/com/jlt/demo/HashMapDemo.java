package com.jlt.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	private Map<Integer, String> userMap = new HashMap<Integer, String>();

	public void printMap() {
		userMap.put(101, "Seema");
		userMap.put(102, "Seema");
		userMap.put(103, "Reema");
		userMap.put(null, null);
		userMap.put(null, null);

		System.out.println(userMap);
	}
}
