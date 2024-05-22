package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_Loop8 {
	public static void main(String[] args) {
		System.out.println("Q2");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = sc.nextInt();
		int i = 0;
		int j = 0;
		for (i = 1; i < num + 1; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i < num+1; i++) {
			for (j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
