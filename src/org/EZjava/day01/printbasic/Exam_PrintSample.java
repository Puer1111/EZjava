package org.EZjava.day01.printbasic;

import java.util.Scanner;

public class Exam_PrintSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	print 명령어는 ln이 없고 개행이 안되므로 개행이 하고 싶다면\n을 입력해야한다
		System.out.print("지금까지와 다른 출력명령어");
		
		System.out.println("지금까지 쓰던 출력명령어");
		
		Scanner sc = new Scanner (System.in);
		System.out.print("하나의 수 입력: " );
		int num = sc.nextInt();
		
//		printf()메소드
		System.out.printf("정수 출력:%d", 57);
	}
}
