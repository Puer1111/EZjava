package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_Loop1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Q1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int i = 0 ,sum =0;
		int num = sc.nextInt();
		if(num>0) {
		
			for(i=0; i < num+1; i++) {
			sum+=i;
		}
		
			System.out.println(sum);
		
		}
		else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}

}
