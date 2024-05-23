package org.EZjava.day05.Random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
//		for( int i=0; i<10; i++) {
		int num = rand.nextInt(10);
		System.out.println(num);
//		}
//		1~10사이 수를 구하시오
		rand.nextInt(10);// 0~9 숫자
		num=rand.nextInt(10)+1;// 1~10
		System.out.println(num);
	
//		25~35 수 구하라
		rand.nextInt(25);
		int num1 = rand.nextInt(10)+25;
		System.out.println(num1);
//		1 or 2
		rand.nextInt(2);
		int num2 = rand.nextInt(2)+1;
		System.out.println(num2);
		// Math.random -> 0 이상 1미만 수(소수) 나옴 * 정수 10 나오게 하려면 +1 
		double randNum = (int)(Math.random()*10+1);
		System.out.println(randNum);
		
		//25~ 35 수 math.random 으로
		double randNum1 = (int)((Math.random()*11)+25);
		System.out.println(randNum1);
	
	
	
	}
	
}
