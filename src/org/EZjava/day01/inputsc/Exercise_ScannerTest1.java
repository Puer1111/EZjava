package org.EZjava.day01.inputsc;

import java.util.Scanner;

public class Exercise_ScannerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*이름 , 도시 ,나이 , 체중 , 독신 여부를 빈칸으로 분리하여 입력하세요
		 	Kim Seoul 20 65.1. true
		 	이름은 Kim, 도시는 Seoul 나이는 20살, 체중은 54.1kg 독신 여부는 true 입니다
		 * //
		 */	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("바로 입력하기 : " + sc.next());		
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean Solo = sc.nextBoolean();		
		System.out.print("이름은 " + name+", ");
		System.out.print("도시는 " + city+ ", ");
		System.out.print("나이는 " + age+ "살, ");
		System.out.print("체중은 " + weight + "kg, ");
		System.out.println("독신 여부는 " + Solo + "입니다 ");
	
	}
	
}
