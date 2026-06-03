package com.dayThree.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class NamesArrayList {
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();
		names.add("Saqib");
		names.add("John");
		names.add("Tommy");
		names.add("Jack");
		System.out.println("Student Names ::");
		for(String name:names) {
			System.out.println(name);
		}
	}

}
