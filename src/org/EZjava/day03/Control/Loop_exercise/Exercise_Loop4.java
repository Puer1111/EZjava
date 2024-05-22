package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_Loop4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력하시요: ");
		
		int small = sc.nextInt();
		int big = sc.nextInt();
		int i =0;
		if(small<1 || big<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		else {
			for(i=small; i<big+1; i++) {
				System.out.println(i);
			}
		}
//		입력된 두 값중 작은값은 초기식에 큰값은 조건식에 입력되게 하라.
		int num1=0 , num2 =0;
		int min = 0 ,max= 0;
		
		if(num1>num2) {
			max= num1;
			min = num2;
		}else {
			max=num2;
			min=num1;
		}
		for(int j=min; j<max; i++) {
			System.out.println(i+"");
		}
		System.out.println();
		for(int j=num1; j<num2+1; i++) {
			System.out.println(i+"");
		}
	
}
}