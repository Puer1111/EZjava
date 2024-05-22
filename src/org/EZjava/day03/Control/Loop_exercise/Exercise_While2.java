package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_While2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		while 문으로 -1 이 입력될때 까지 정수 입력받고
//		-1 입력되면 입력한 수의 합 출력	
//		
//		int sum = 0;
//		int i = 0;
//		while(i<10) {
//			System.out.println("정수 입력: ");
//			int num = sc.nextInt();
//			i++;
//			sum += num;
//			if(num == -1) {			
//				break;
//			}
//		}
//		System.out.println("입력한 수의 합: "+ sum);
		
		
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int input = sc.nextInt();
		System.out.println("정수 하나 입력: ");
		while(input!=-1) {
			sum += input;
			System.out.println("정수 하나 입력: ");
			input = sc.nextInt();
				if(input == -1) {
					break;
					}
			
				
			}
		System.out.println("합: " + sum);
		}
}

