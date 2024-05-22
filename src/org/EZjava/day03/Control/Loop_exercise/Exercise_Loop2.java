package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Q2");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시요: ");
		int num = sc.nextInt();
		int i = 0;
		if(num>1) {
		for (i = num; i>0; i--) {
			System.out.print(i);
			}
		}
		}	
	}
