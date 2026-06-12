package com.JavaStandardEditionCore;

class Table2 extends Thread{
// Static Synchronized  
synchronized static void printTable(int n){
		System.out.println("Thread Running...");  
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
				}catch (Exception e) {System.out.println(e);}
		}
	}
}
class class1 extends Thread{
	public void run() {
		Table2.printTable(10);
	}
}

public class StaticSynchronizedExample {
	public static void main(String args[]) {
		class1 obj = new class1();
		obj.start();
		
	}
}
