package org.EZjava.day05.Exception.exercise;

import java.util.Scanner;

public class Exercise_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  / exam exception
		Scanner sc =new Scanner(System.in);
			int result =0;
		while(true) {
			try {
			System.out.println("정수 1: ");
			System.out.println("정수 2 : ");
			int num = sc.nextInt();
			int num1 =sc.nextInt();
			result = num/num1;
						
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
			continue;
		}
	System.out.println("몫 :" + result);
		}
	}
}
