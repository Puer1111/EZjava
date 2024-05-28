package org.EZjava.day08.oop.ObjectArray.student;

import java.util.Scanner;

public class ViewStudent {
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택 >>");
		int input = sc.nextInt();
		return input;
	}
	
	public Student[] displayInput() {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		for( int i =0; i<students.length; i++) {
		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("첫번째 점수: ");
		int firstScore = sc.nextInt();
		System.out.println("두번째 점수: ");
		int secondScore = sc.nextInt();
		students[i] = new Student(name, firstScore, secondScore);
	}
		return students;
	}
	
	public static void displayMsg(String message) {
		System.out.println(message);
	}
	
	public void displayInfo(Student[] students) {
	for (int i = 0; i < students.length; i++) {
		System.out.println(students[i].toString());
	}
	}
}
