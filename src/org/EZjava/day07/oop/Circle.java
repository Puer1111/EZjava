package org.EZjava.day07.oop;

import java.util.Scanner;

public class Circle {


	public double radius;
	public String name;
	public final double PI = 3.14;

	public void setRadius(int r) {
		
	}
	public double getarea() {
		// return 사용 시 public 옆에 
//		리턴값과 같은 데이터 타입을 써야함.
		return PI*this.radius*this.radius;
		
	}
}
