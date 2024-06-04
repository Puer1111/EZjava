package org.EZjava.day09.oop.Overriding;

public class Line extends Shape{
@Override // 어노테이션 생략 가능
public void draw() {
	System.out.println("Line");
}
}
