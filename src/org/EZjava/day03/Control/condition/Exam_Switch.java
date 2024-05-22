package org.EZjava.day03.Control.condition;

import java.util.Scanner;

public class Exam_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		조건문
//		if-else if else 와 대응되는 구문이다.
//		문법
//		switch(식) {
//		case value1 :
//				실행문;
//			break;
//		case value2 :
//				실행문;	
//			break;
//			default:
//				실행문;
		
//	
//	}
		
//	Q1. 정수를 입력받아 입력한 값이 1이면 빨간색, 2면 노란색 , 3이면 초록색으로 출력하시오
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 하나 입력");
	int num = sc.nextInt();
		switch(num) {
	case 1:
		System.out.println("빨간색");
		break;
	case 2:
		System.out.println("노란색");
		break;
	case 3:
		System.out.println("파란색");
		break;
	default:
		System.out.println("1~3 사이 숫자 입력하시오");
			}
		}
	}
