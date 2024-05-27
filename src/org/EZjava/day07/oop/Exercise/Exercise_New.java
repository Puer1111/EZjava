package org.EZjava.day07.oop.Exercise;

import java.util.Scanner;

public class Exercise_New {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

	System.out.println("메뉴 선택");
	System.out.println("1. 문의 관련");
	System.out.println("2. 원격 제어");
	System.out.println("3. 전화 상담");
	
	System.out.println("메뉴 선택(1~3): ");
	int a = sc.nextInt();
	if(a == 1) {
		System.out.println("1. 구매관련문의");
		System.out.println("2. 오류관련문의");
		System.out.println("3. 환불관련문의");
		System.out.println();
		System.out.println("메뉴 선택(1~3): ");
		int b = sc.nextInt();
		if(b==1) {
			System.out.println("1.결제가 됬으나 미구매 상태");
			System.out.println("2.결제 시 구매 창 진행 안됨");
			System.out.println();
			System.out.println("메뉴 선택 (1~2): ");
			int c = sc.nextInt();
				if(c==1) {
					System.out.println("결제 카드 번호 입력: ");
					String e = sc.next();
				}
				if(c==2) {
					System.out.println("호환성 추가 및 새로고침");
				}
		}
		else if (b==2) {
			System.out.println("1.사이트 접속 안됨");
			System.out.println("2.로그인이 안됨");
			System.out.println();
			System.out.println("메뉴 선택 (1~2): ");
			int c = sc.nextInt();
				if(c==1) {
					System.out.println("호환성 추가 및 새로고침");
				}
				if(c==2) {
					System.out.println("키보드 관련 보안 프로그램 설치");
				}
		}
		
		else {
			System.out.println("1.환불처리");
			int c = sc.nextInt();
			if(c==1) {
				System.out.println("환불 가능 상품: 구매이력: ○○○○ 구매 날짜: 240527");
				System.out.println("환불 하시겠습니까?");
				String e= sc.next();
				if(e.equals("예")) {
					System.out.println("환불 되었습니다");
				}
			}
		}
	}
	else if (a==2) {
		System.out.println("2. 원격 신청");
			int c = sc.nextInt();
			if(c==1) {
				System.out.println("날짜 : "+","+"전화번호: ");
			}
	}		
	else {
				System.out.println("3. 전화 연결");
				int c = sc.nextInt();
					if(c==1) {
						System.out.println("상담원 전화번호: xx-xxxx-xxxx");
					}
	}
	}
}