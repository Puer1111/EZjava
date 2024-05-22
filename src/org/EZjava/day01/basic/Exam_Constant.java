package org.EZjava.day01.basic;

public class Exam_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수는 소문자로 시작
//		상수는 모두 대문자
		final double PI=3.14;
		
//		PI=3.24; >> 재할당 불가능 -> 상수final
		double radius = 10.2;
		radius =5.4;
		double circleArea = radius * radius * PI;
		System.out.println("원의면적:" + circleArea);
	
	}
	

}
