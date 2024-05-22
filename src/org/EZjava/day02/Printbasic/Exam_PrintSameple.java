package org.EZjava.day02.Printbasic;

public class Exam_PrintSameple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이것이 원래 쓰던거");	
		System.out.print("조금 다른거 \n");//개행이 없어서 \n
		System.out.printf("정수 출력: %d \n", 57);
	// 형식문자
		// 정수 : %d
		// 실수 : %f
		// 문자 : %c
		// 문자열: %s
		System.out.printf("정수 출력 : %d , 문자열 출력 : %s \n",1023,"일공이삼");
		System.out.println("이제 끝");		
		System.out.printf("개강 날짜 : %.2f, 종강날짜 : %.2f \n",5.7 , 10.23);
	
	}
	
	

}
