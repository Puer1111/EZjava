package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_Loop11 {

	
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
		System.out.printf(isPrime ? "소수" : "소수아님");
	}
	}
