package com.dayThree.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class InsertRemoveEleInArrayList {
	public static void main(String args[]) {
		List<String> CarCompanies = new ArrayList<String>();
		CarCompanies.add("Tata");
		CarCompanies.add("BMW");
		CarCompanies.add("Maruti Suzuki");
		System.out.println("All Companies : "+CarCompanies);
		CarCompanies.add(1, "Audi");
		System.out.println("After Insertin 'Audi' at 1 index All Companies : "+CarCompanies);
		System.out.println("Retrieving First Company : "+CarCompanies.getFirst());	
		System.out.println("Retrieving Last Company : "+CarCompanies.getLast());
		System.out.println("Retrieving Specific Company like at index 1 : "+CarCompanies.get(1));	
	}

}
