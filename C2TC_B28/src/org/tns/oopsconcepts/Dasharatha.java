package org.tns.oopsconcepts;


class Rama extends Dasharatha{
	void display2() {
		System.out.println("I am the father");
	}

}
class Lava extends Rama{
	void display3() {
		System.out.println("I am s/o Rama");
	}
}
public class Dasharatha {
	void display1() {
		System.out.println("I am the grandfather");
	}
	public static void main(String[] args) {
		Lava b1= new Lava();
		b1.display1();
		b1.display2();
		b1.display3();
}
}
