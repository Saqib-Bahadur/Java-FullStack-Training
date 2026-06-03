package com.dayThree.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class CityArrayList {
	public static void main(String args[]) {
		List<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Ichalkaranji");
		System.out.println("Cities Names ::");
		for(String city:cities) {
			System.out.println(city);
		}
		System.out.println("Size of ArrayList :"+cities.size());
	}
}
