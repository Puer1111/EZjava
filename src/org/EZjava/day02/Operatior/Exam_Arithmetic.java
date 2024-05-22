package org.EZjava.day02.Operatior;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		산술 연산
//		+,-,*,/,%
//		%  : 나머지 연산자
//	 	문제 1 
//		초 단위의 정수를 입력받고 , 몇시간 , 몇분,몇초인지 출력하는 프로그램을 작성하여라.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("초 단위의 정수를 입력해주세요");
		int time = sc.nextInt();
		int hour = time / 60 / 60 ;
		System.out.println(hour + "시간");
		int minute = (time/60)%60;
		System.out.println(hour + "시간" + minute + "분");
		int sec = time % 60 ;
		System.out.println(hour + "시간" + minute + "분" + sec + "초");
	}

}
