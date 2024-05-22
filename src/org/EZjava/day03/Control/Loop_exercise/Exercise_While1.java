package org.EZjava.day03.Control.Loop_exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while 문으로 1~100 사이 홀수 합 출력
//		1~100 사이 홀수 합?:
//		
		int i = 0;
		int sum = 0;
		int sum1 = 0;

		while (i < 101) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("홀수= " + sum);

	}

}
