package org.EZjava.day01.inputsc;

import java.util.Scanner;

public class Exam_ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Test: ");
		sc.next();
		System.out.println("하나의 수를 입력해 주세요 :");
		int a = sc.nextInt();	

		System.out.println("a의 값 : " + a );

	}
	

}
