package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시요: ");
		int num = sc.nextInt();
		int sum = 0;
		int i=0;
	
		for(i=1; i<num+1; i++) {
			sum+=i;
		}
		System.out.println("정수들의 합:" + sum);
		System.out.println("1부터" + num + "까지의 합: " + sum);
	
	}

}
