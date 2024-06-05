package org.EZjava.day07.oop.Exercise;

import java.util.Scanner;

public class Exercise_New1 {
	int select;
	int enquire;
	int purchase;
	int error;
	int num4;
	int date=0;
	int phone=0;
	int control;
	int counsel;
	String refund;
	Scanner sc = new Scanner(System.in);

	public int Menu() {

		System.out.println("메뉴 선택");
		System.out.println("1. 문의 관련");
		System.out.println("2. 원격 제어");
		System.out.println("3. 전화 상담");

		System.out.println("메뉴 선택(1~3): ");
		int select = sc.nextInt();
		return select;
	}

	public int enquire() { // 문의

		System.out.println("1. 구매관련문의");
		System.out.println("2. 오류관련문의");
		System.out.println("3. 환불관련문의");
		System.out.println();
		System.out.println("메뉴 선택(1~3): ");
		int enquire = sc.nextInt();
		return enquire;
	}

	public int purchase() { // 1-1번 구매
		System.out.println("1.결제가 됬으나 미구매 상태");
		System.out.println("2.결제 시 구매 창 진행 안됨");
		System.out.println();
		System.out.println("메뉴 선택 (1~2): ");
		int purchase = sc.nextInt();
		return purchase;
	}

	public int error() { // 1-2번 오류

		System.out.println("1.사이트 접속 안됨");
		System.out.println("2.로그인이 안됨");
		System.out.println();
		System.out.println("메뉴 선택 (1~2): ");
		int error = sc.nextInt();
		return error;
	}

	public void error1() {
		System.out.println("호환성 추가 및 새로고침");
	}

	public void error2() {
		System.out.println("키보드 관련 보안 프로그램 설치");
	}

	public void refund() { // 1-3번 환불
		System.out.println("1.환불처리");

	}

	public void refund1() {
		System.out.println("환불 가능 상품: 구매이력: ○○○○ 구매 날짜: 240527");
		System.out.println("환불 하시겠습니까?");
		refund = sc.next();
	}

	public int control() {// 2번 원격

		System.out.println("2. 원격 제어 신청");
		int control = sc.nextInt();
		return control;
	}

	public void control1() {
		System.out.println("날짜 : " + "," + "전화번호: ");
		date = sc.nextInt();
		phone = sc.nextInt();
	}

	public int counsel() {// 3번 전화 상담

		System.out.println("3. 전화 연결");
		int counsel = sc.nextInt();
		return counsel;
	}

	public void counsel1() {
		System.out.println("상담원 전화번호: xx-xxxx-xxxx");
	}

	public void displayMsg(String message) {
		System.out.println(message);
	}
}