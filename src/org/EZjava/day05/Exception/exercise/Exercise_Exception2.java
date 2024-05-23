package org.EZjava.day05.Exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			3개의 정수를 입력받아 합을 구하는 프로그램
//			사용자가 정수가 아닌 문자를 입력할 때 발생하는
//			InputMismatchException 예외를 처리하여 다시 입력받게 하라
//			정수 3개 입력하시오.
//			11 2 3
//			합 16
		Scanner sc = new Scanner(System.in);
		int num =0,num1=0,num2=0,sum = 0;
		for(int i =0; i<3; i++) {
		try {
			System.out.print("3개의 정수를 입력하시요 : ");
			num=sc.nextInt();
			num1=sc.nextInt();
			num2=sc.nextInt();
			sum = num+num1+num2;
			System.out.println("합: "+ sum);
		}catch(InputMismatchException e ) {
			System.out.println("문자가 아닌 정수를 입력하세요");
			sc.next();
			i--; // for 문이지만 무한반복 할 수 있게 i++증가를 깎는다.
		}
		}
		
	
	
	}

}
