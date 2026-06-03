package com.dayThree;

//parent class
class Car{
	void ApplyBrake(){
		
		System.out.println("Apply brake");
	}
}

class Tata extends Car{
	
	void ApplyBrake(){
		
		System.out.println(" Tata Apply brake");
	}
	
}



public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Tata();
		car.ApplyBrake();
		
		Tata tata= new Tata();
		tata.ApplyBrake();
		
		Car car1 = new Car();
		car1.ApplyBrake();

	}

}