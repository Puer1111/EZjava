package org.EZjava.day09.oop.emcapsulation;

import java.util.Scanner;

public class Circle {


	private double radius;
	private String name;
	public final double PI = 3.14;

	public void setRadius(int r) {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getName() {
		return this.name;
	}
	public double getarea() {
		// return 사용 시 public 옆에 
//		리턴값과 같은 데이터 타입을 써야함.
		return PI*this.radius*this.radius;
		
	}
}
