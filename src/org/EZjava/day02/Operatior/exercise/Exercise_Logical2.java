package org.EZjava.day02.Operatior.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Q3");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 숫자를 입력하세요:");
		int num5 = sc.nextInt();
		boolean result13;
		result13 = (0<num5) && (num5<101);
		System.out.println("1부터 100 사이의 숫자인가?"+ result13);
	
//-----------------------------------------------------------

		System.out.println("Q4");
		
//		char a = 'A'+10;
////		String str = "";
////		a= 'a'+1;
//		System.out.println("문자: "+ a);
		
		
		Scanner sc1= new Scanner (System.in);
		System.out.println("문자를 입력해주세요: ");
		char word;	
		word= sc.next().charAt(0);
		boolean result = (64 < word )&&( word < 91);
		System.out.println("영어 대문자 확인 : " + result );
		
}

}
		
		  // Scanner sc1 = new Scanner(System.in);
//		 	String word= sc1.next();
//		System.out.println("영어 대문자 확인 :" +Character.isUpperCase(word.charAt(0)));
	
	
	


