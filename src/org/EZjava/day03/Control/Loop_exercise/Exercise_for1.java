package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;

public class Exercise_for1 {

	public Exercise_for1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		정수 하나를 입력받아서 그 수가 1~9 사이의 수일때 그 수의 구구단을 출력하라
//		조건이 맞지 않으면 "1~9 사이의 양수를 입력하시오"를 출력하라
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력: ");
		int dan = sc.nextInt();
		if(dan<10 && dan>0) {
			for (int i=1; i<10; i++) {
				System.out.println(dan + "x"+ i + "=" + dan * i);
				}
		}
		else {
				System.out.println("1~9사이의 수를 입력하시오");
			}
	}

}
