package org.EZjava.day09.oop.emcapsulation;

import java.util.Scanner;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;
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

//	public Student(String name, int firstScore, int secondScore) {
//		this.name = name;
//		this.firstScore = firstScore;
//		this.secondScore = secondScore;
	

	public void setName(String name) {// 괄호 안은 매개변수로 전달하려는 값
		this.name = name;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

	public String getName() {
		return this.name;
	}

	public int getFirtstScore() {
		return this.firstScore;
	}

	public int getSecondScore() {
		return this.secondScore;
	}

	public String toString() {
		return this.name + "학생의 점수는" + this.firstScore + "점, 두번째 점수는" + this.secondScore + "점 입니다";
	}
}
