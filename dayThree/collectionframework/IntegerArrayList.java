package com.dayThree.collectionframework;
import java.util.ArrayList;
import java.util.List;
public class IntegerArrayList {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>(10);
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.print("ArrayList Items : ");
		for(int num : list) {
			System.out.print(+num+"  ");	
		}
		
	}
}
