package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;
public class Exercise_Loop7 {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시요: ");
		int num = sc.nextInt();
		int i = 0;
		int squared = 0;
		int cube = 0;
		for( i=1; i<num+1; i++) {
			squared = 2*i;
			cube = 3*i;
			System.out.println("2의배수 :" + squared);
			System.out.println("3의배수 :" + cube);
			System.out.println("2와3의공배수: " + (squared*cube)/i);
		}
		}
		}	
