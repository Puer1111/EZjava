package org.EZjava.day03.Control.Loop_exercise;

import java.util.Scanner;
public class Exercise_Loop6 {
public static void main(String[] args) {



	Scanner sc = new Scanner(System.in);
	System.out.println("단을 입력하시요: ");
	int dan = sc.nextInt();
	int i= 0 , j = 0;;
	if(dan<10) {
	for(i= dan; i<10; i++) {
		for(j = 1; j<9; j++) {
		System.out.println( i+"x"+ j +"="+ i*i);
	}
	}
	}  
	else {
		System.out.println("9이하의 숫자만 입력해주세요");
	}
	
		}
		}	
