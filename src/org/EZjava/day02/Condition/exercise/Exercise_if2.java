package org.EZjava.day02.Condition.exercise;

import java.util.Scanner;

public class Exercise_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q2. 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
//		주문하시겠어요? 가격을 알려드립니다.
//		(에스프레소  , 카푸치노 , 카페라떼, 아메리카노)
//		메뉴를 입력해주세요 : 에스프레소
//		2500원 입니다.
//		메뉴를 입력해주세요 : 자바칩프라프치노
//    	없는 메뉴 입니다.		
		Scanner sc = new Scanner(System.in);
		String menu1 = "에스프레소";
		String menu2 = "자바칩프라프치노";
		System.out.println("에스프레소  , 카푸치노 , 카페라떼, 아메리카노");
		System.out.println("주문하시겠어요? 가격을 알려드립니다: ");
		String menu = sc.next();
		if (menu1.equals(menu)) {
			System.out.println("2500원입니다");
		}
		else if(menu2.equals(menu)) {
				System.out.println("없는 메뉴입니다.");
			}
		else {
			System.out.println("상품 준비중입니다.");
		}
	}
}
//		문자열 비교는 .equals 사용 contain 메소드도 있따.
//		선생님 ver.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("에스프레소  , 카푸치노 , 카페라떼, 아메리카노");
//		System.out.println("주문하시겠어요? 가격을 알려드립니다: ");
//		String menu = sc.next();
//		if (menu1.equals("에스프레소")) {
//			System.out.println("2500원입니다");
//		}
//		else if(menu2.equals("자바칩프라프치노")){
//				System.out.println("없는 메뉴입니다.");
//			}
//		else {
//			System.out.println("상품 준비중입니다.");
//		}	
//	
//	}
//}

