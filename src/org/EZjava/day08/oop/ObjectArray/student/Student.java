package org.EZjava.day08.oop.ObjectArray.student;

import java.util.Scanner;

public class Student{
public String name;
public int firstScore;
public int secondScore;
//	Scanner sc = new Scanner(System.in);
//
//	public int printMenu() {
//
//		System.out.println("====== 메인 메뉴 ======");
//		System.out.println("1. 성적입력");
//		System.out.println("2. 성적출력");
//		System.out.println("3. 종료");
//		System.out.println("선택 >>");
//		int choice = sc.nextInt();
//		return choice;
//	}
//
//	public void displayMsg(String message) {
//		System.out.println(message);
//	}

	public Student() {
	}

	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}

	public String toString() {
			return this.name+"학생의 점수는"+ this.firstScore+"점, 두번째 점수는"+this.secondScore+"점 입니다";
	}
}
