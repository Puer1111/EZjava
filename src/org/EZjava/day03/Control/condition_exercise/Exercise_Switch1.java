package org.EZjava.day03.Control.condition_exercise;

import java.util.Scanner;

public class Exercise_Switch1 {

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
		String menu = sc.next();
		int price=0;
//		String menu1 = "에스프레소";
//		String menu2 = "자바칩프라프치노";
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("메뉴를 입력해주세요: ");
		switch(menu) {
			case "에스프레소":
				price = 2500;
//				System.out.println("2500원입니다");
					break;			
			case "자바칩프라프치노":
//				System.out.println("없는 메뉴입니다");
					break;
			default:
				System.out.println("상품 준비중입니다.");
				break;
		}
		if(price !=0) {
			System.out.println(price + "원 입니다.");
		}
	}

}
