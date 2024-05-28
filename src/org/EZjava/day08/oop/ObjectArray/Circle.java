package org.EZjava.day08.oop.ObjectArray;

public class Circle {

	public int radius;
	

public Circle() {} // 생성자

public Circle(int radius) { // 매개 변수가 있는 생성자
	this.radius = radius;
}
public double getArea() {
	double area= 3.14*this.radius * this.radius;
	return area;
}
}


