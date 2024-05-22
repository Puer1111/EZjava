package org.EZjava.day02.Operatior;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		삼항 연산자
//	 (조건식) ? 참일때 : 거짓일 때
		
//		조건식은 반드시 true / false 로 반환
//		비교/논리 연산자 주로 사용
	
//	Q1 . 정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램을 작성하시오
		Scanner sc1 = new Scanner(System.in);
		int c = sc1.nextInt();		
		String result= (c % 2!= 0)? "홀수" : "짝수" ;			
		System.out.println(result + "입니다");
	}
}
//		if ( c % 2 !=0) {
//			System.out.println("홀수");
//		}
//		else {
//			System.out.println("짝수");	
//			}
//				
//			}
//	

//	}


