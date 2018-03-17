package com.examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public MapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
	    Map<Integer, String> mils = new HashMap<>();
	    mils.put(1, "foo");
	    mils.put(2, "bar");
	    System.out.println("mils:\t" + mils);
	    mils.put(1, "foo");
	    System.out.println("mils:\t" + mils);
}
}
