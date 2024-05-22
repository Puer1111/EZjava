package org.EZjava.day02.Condition.exercise;

import java.util.Scanner;

public class Exercise_if3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Q3. 	점수를 입력받아 등급을 알려주는 프로그램을 작성
//		점수를 입력해주셍 :92 
//		학점은 a입니다.
//		 단, 점수는 0~100 사이의 수를 입력하도록 함.
//		점수를 입력해주세요 102
//		0~100 사이의 수를 입력해주세요
//		커트라인 ( ~90 : A , ~80 : B , ~70 : C , ~60: D , 그외 F)
		Scanner sc = new Scanner (System.in);
		System.out.println("점수를 입력해주세요: " );
		int score = sc.nextInt();
		// char grade = 0;
		if(score>=90) {
			if(score>100) {
				System.out.println("1~100사이만 가능");
			}
			else { 
				System.out.println("A");
//				grade = 'A';
			}
		}	
		else if (score>=80) {
			System.out.println("B");
//			grade = 'B';
		}
		else if (score>=70) {
			
			System.out.println("C");
//			grade = 'C';
		}
		else if (score>=60) {
			System.out.println("D");
//		grade = 'D';
		}
		else {	
//			
			if(score < 0) {
				System.out.println("1~100사이만 가능");
			}
			else {
//				grade = 'F';
				System.out.println("F");				
			}
		}
	}
}	
