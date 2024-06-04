package org.EZjava.day10.oop.abstractex;

class Line extends Shape{
	
	public void draw() {}


}


public abstract class Shape {
	String name;
	
	public Shape() {}
	
	public void paint() {}

	public abstract void draw();// 추상메소드라 추상 클래스 안에 있어야함 


}
