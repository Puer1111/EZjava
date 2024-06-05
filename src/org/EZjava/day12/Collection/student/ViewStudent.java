package org.EZjava.day12.Collection.student;

import java.util.List;
import java.util.Scanner;

public class ViewStudent {
public int printMenu() {
	Scanner sc = new Scanner(System.in);
	System.out.println("학생 성적관리 프로그램");
	System.out.println("0. 프로그램 종료");
	System.out.println("1. 학생 정보 입력 ");
	System.out.println("2. 학생 정보 이름 검색");
	System.out.println("3. 학생 정보 전체 출력");
	System.out.println("4. 학생 정보 수정");
	System.out.println("5. 학생 정보 삭제");
	System.out.println("6. 재평가 대상 여부 확인");
	int choice = sc.nextInt();
	return choice;
}

public void displayMsg(String msg) {
	System.out.println(msg);
}
public void displayInfo(Student[] students) {
	
}
public Student inputStudent() {
	Scanner sc = new Scanner(System.in);
	System.out.println("이름: ");
	String name = sc.next();
	System.out.println("1번째 점수: ");
	int firstScore = sc.nextInt();
	System.out.println("2번째 점수: ");
	int secondScore = sc.nextInt();
	
	Student std = new Student(name,firstScore,secondScore);
	return std;
	
}

//public Student InputInfo() {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("이름: ");
//	String name = sc.next();
//	System.out.println("1번째 점수: ");
//	int firstScore = sc.nextInt();
//	System.out.println("2번째 점수: ");
//	int secondScore = sc.nextInt();
//	
//	Student std = new Student(name, firstScore, secondScore);
//	return std;

public String InputName(String category) {
	Scanner sc = new Scanner(System.in);
	System.out.println(category + "할 이름: ");
	String name = sc.next();
	return name;
}

public void displayStudents(List <Student> stdList) {
	System.out.println("==학생 정보 출력 ==");
	for(Student std :stdList) {
	System.out.printf("이름: %s\n",std.getName());
	System.out.printf("1차점수: %d\n",std.getFirstScore());
	System.out.printf("2차점수: %d\n",std.getSecondScore());
	System.out.println("====================");
}
	
}

public Student modifyStudent(Student student) {
Scanner sc =new Scanner(System.in);
System.out.println("수정할 1차 입력: ");
int firstScore = sc.nextInt();
System.out.println("수정할 2차 입력: ");
int secondScore = sc.nextInt();	
student.setFirstScore(firstScore);
student.setSecondScore(secondScore);

return student;
	
	
	
}
}
