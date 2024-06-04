package org.EZjava.day10.oop.Polymorphism;

class Car {
}

class Sonata extends Car {
}

class Genesis extends Car {
}

class GV80 extends Genesis {
}

public class Exam_instanceOf {

	static void print(Car car) {
		if (car instanceof Sonata) {
			System.out.println("소나타 점프!");
		}
		if (car instanceof GV80) {
			System.out.println("GV80 방방");
		}
		if (car instanceof Genesis) {
			System.out.println("제네시스 방방");
		} else {
			System.out.println("부릉부릉");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new Car());
		print(new Sonata());
		print(new Genesis());
		print(new GV80());
	}

}
