package org.EZjava.day02.Operatior;

import java.util.Scanner;

public class Exam_Logical {
	public static void main(String[] args) {
//	 	논리 연산자 ex
//		남자이면서 평균 평점 4.3 이상 -> AND 
//		컴퓨터 공학과 또는 경영학과 -> OR
		boolean result1;
		boolean result2;
		boolean result3;
		boolean result4;		
//		AND - > && , OR -> ||		
		int num1 = 50;
		int num2 = 30;
		
		result1 = (num1 == num2) && (num1 < num2);
		System.out.println("결과값 : " + result1);
		result2 = (num1 < num2 )|| (num1 == num2 );
		System.out.println("결과값2 : " + result2);
		result3 = (num1 > num2 )&&(num1 != num2);
		result4 = (num1> num2)|| (num1 == num2);
		System.out.println("결과값3 : " + result3);
		System.out.println("결과값4 : "+ result4);

		System.out.println("Q1");
		int a= 50;
		int b= 30;
		boolean result5;
		boolean result6;	
		boolean result7;
		boolean result8;
		
		result5= (a!=b)&&(a<b);
		result6= (a<b)||(a==b);
		result7= (a>b)&&(a!=b);
		result8= (a>b)||(a==b);

	System.out.println("결과값: " + result5);
	System.out.println("결과값: " + result6);
	System.out.println("결과값: " + result7);
	System.out.println("결과값: " + result8);
//	------------------------------------------------------
		System.out.println("Q2");
		
		int num3 = 70;
		int num4 = 55;
		
		boolean result9;
		boolean result10;	
		boolean result11;
		boolean result12;
		
		result9 = (num3==num4)||(num3++<100);
//			num3 = 71 num4 = 55 true
		result10 = (num3<num4)&&(--num4<55);
//			num3 =71  num4 = 55 false
		result11 = (num3!=num4) && (num4--<num3++);
//			num3 = 72 num4 = 54 true
		result12 = (num3++ != num4) || (num4++ >= 85);
//			num3 = 73 num4 = 54 
		System.out.println("a :"+ a + "b :" + b);
		
		System.out.println("결과값: "+ result9);
		System.out.println("결과값: "+ result10);
		System.out.println("결과값: "+ result11);
		System.out.println("결과값: "+ result12);
//		---------------------------------------------------------
		
	}
}