package org.EZjava.day08.oop.score;

import java.util.Scanner;

public class Student {
//	메뉴
//	성적입력
//	성적 출력
//	메시지 출력

//	멤버 필드
	int kor ;
	int eng ;
	int math;
// 생성자
	public Student() {}
//	멤버 메소드
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >>");
		int choice = sc.nextInt();
		return choice;
	}
	public  void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===성적 입력===");
		System.out.println("국어: ");
			 kor =sc.nextInt(); //위에 멤버 필드가 선언 되어있기에 기본형 선언x 
		System.out.println("영어: " );
		 	eng = sc.nextInt();
		System.out.println("수학: ");
			math = sc.nextInt();
	}
	public void printScore() {
		System.out.println("===성적 출력===");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + (kor+eng+math));
		System.out.println("평균: "+ (kor+eng+math)/3.0);		
	}
	public	void displayMsg(String message) {
		System.out.println(message);
	}
}
