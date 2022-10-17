package org.tns.oopsconcepts;

public class Car {
	void displaynames() {
		System.out.println("Following are the models of Car");
	}
	public static void main(String[] args) {
		Bmw b1= new Bmw();
		b1.displaynames();
		b1.show1();
		seden b2= new seden();
		
		b2.show2();
		suvu b3= new suvu();
		
		b3.show3();
		
	}

}
class Bmw extends Car{
	void show1() {
		System.out.println("Model1");
	}	
}
class seden extends Car{
	void show2() {
		System.out.println("Model2");
	}	
	
}
class suvu extends Car{
	void show3() {
		System.out.println("Model3");
	}
	
}
