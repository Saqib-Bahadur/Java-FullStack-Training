package com.dayOne;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first =0;
		int second =1;
		System.out.print(first+ " "+second);
		for(int i=2;i<=10;i++) {
			int temp = first+second;
			first = second;
			second = temp;
			System.out.print(" "+temp);
		}
	}

}
