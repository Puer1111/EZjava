package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;
public class Exercise_Loop5 {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하시요: ");
		int dan = sc.nextInt();
		int i= 0;
		for(i= 0; i<10; i++) {
			System.out.println(dan +"x"+i +"="+ dan*i);
		}
		}
		}	
