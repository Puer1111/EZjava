package org.EZjava.day08.oop.ObjectArray;

public class Exam_objectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====객체 생성 후 출력=====");
		Circle donut = new Circle(10);
	
		System.out.println("원의 넓이: "+ donut.getArea());
		
		Circle pizza = new Circle(7);
		
		System.out.println("원의 넓이: "+ pizza.getArea());
		
		
		System.out.println("===배열 초기화 후 출력===");
		
		Circle[] cArrs = new Circle[5];
		cArrs[0] = donut;
		cArrs[1] = pizza;
		//Nullpointer Exception 이 나지 않게 하려면
		cArrs[2] = new Circle(6); // cArrs[2]에 6 대입
		cArrs[3] = new Circle(8);
		cArrs[4] = new Circle(9);
		
		System.out.println(cArrs[0].getArea()); // cArrs0 이 도넛이라 donut.getarea 처럼 사용 가능
		System.out.println(cArrs[1].getArea()); //
		System.out.println(cArrs[2].getArea()); //
		System.out.println(cArrs[3].getArea()); //
		System.out.println(cArrs[4].getArea()); //
	}

}
