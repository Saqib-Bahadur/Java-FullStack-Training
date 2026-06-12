package com.JavaStandardEditionCore;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table obj = new Table();
		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(10);
			}
		};
		
		t1.start();
		t2.start();
	}

}
