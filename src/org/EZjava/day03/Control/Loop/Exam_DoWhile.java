package org.EZjava.day03.Control.Loop;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Do ~ While 
//		문법
//		초기식;
//		do { 실행문; 증감식;}
//		while(조건식)

		//	while 문으로 -1 이 입력될때 까지 정수 입력받고
//		-1 입력되면 입력한 수의 합 출력	
		Scanner sc = new Scanner(System.in);
		int sum = 0 , num = 0;
		do {
			System.out.println("정수 하나 입력: ");
			 num = sc.nextInt();
			sum+=num;
		}while(num!=-1);
		System.out.println("총합: "+ sum);
	}
}


