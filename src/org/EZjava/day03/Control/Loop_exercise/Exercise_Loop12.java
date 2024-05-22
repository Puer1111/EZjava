package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_Loop12 {

	
	public static void main(String[] args) {
	
			System.out.println("Q5");
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하시요: ");
		
		int num = sc.nextInt();
		boolean isPrime=true;

		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		if(num<2) {
			System.out.println("잘못 입력하셨습니다");
		}
		System.out.printf(isPrime ? "소수" : "소수아님");
	}
	}
