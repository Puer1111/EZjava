package org.EZjava.day03.Control.condition_exercise;

import java.util.Scanner;

public class Exercise_Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Q3. 	점수를 입력받아 등급을 알려주는 프로그램을 작성
//		점수를 입력해주셍 :92 
//		학점은 a입니다.
//		 단, 점수는 0~100 사이의 수를 입력하도록 함.
//		점수를 입력해주세요 102
//		0~100 사이의 수를 입력해주세요
//		커트라인 ( ~90 : A , ~80 : B , ~70 : C , ~60: D , 그외 F)		
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력해주세요: ");
		int score = sc.nextInt();
		char grade;
		switch(score/10){
		
			case 10:
//				System.out.println("A");
				grade = 'A';
				break;
			case 9:
//				System.out.println("A");
				grade = 'A';
				break;
			case 8:
//				System.out.println("B");
				grade = 'B';
				break;
			case 7:
//				System.out.println("C");
				grade = 'C';
				break;
			case 6:
//				System.out.println("D");
				grade = 'D';
				break;
			default :
//				System.out.println("F");
				grade = 'F';
				break;
			}
			System.out.println(grade + "등급");
		
	}
	
}
