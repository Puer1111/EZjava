package org.EZjava.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {
	static int kor ; // 하단 모두에 kor ,eng ,math 쓰기 위해 쓰는 곳 밖에서 선언	
	static int eng; // 아래 메소드들이 다 static 이라 스태틱 써야 한다.
	static int math;// scoreprogram2 의 멤버 필드가 된다
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		finish:
		while(true) {
		int choice =printMenu();
		// 하단에 깔끔하게 정리 및 입력받는 코드 정리
			switch(choice) {
			case 1:
				inputScore();
				break;
			case 2 :
				printScore();
				break;
			case 3 :
				//System.out.println("프로그램을 종료합니다.");
				displayMsg("프로그램을 종료합니다");
				break finish;
				default :
					System.out.println("1~3사이 수 입력해주세요");
			}
		}
	}
	private static void displayMsg(String message) {
		System.out.println(message);
	}
	public static void printScore() {
		System.out.println("===성적 출력===");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + (kor+eng+math));
		System.out.println("평균: "+ (kor+eng+math)/3.0);		
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===성적 입력===");
		System.out.println("국어: ");
			 kor =sc.nextInt(); //위에 멤버 필드가 선언 되어있기에 기본형 선언x 
		System.out.println("영어: " );
		 	eng = sc.nextInt();
		System.out.println("수학: ");
			math = sc.nextInt();
	}
	
	
		public static int printMenu() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택 >>");
			int choice = sc.nextInt();
			return choice;
		}
}
		

