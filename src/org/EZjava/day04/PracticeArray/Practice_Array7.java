package org.EZjava.day04.PracticeArray;

import java.util.Scanner;

public class Practice_Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int arry = sc.nextInt();
		int num[] = new int[arry];
		int sum = 0;
		for(int i = 0; i< arry; i++) {
			System.out.print("배열"+ i +"번째 인덱스에 넣을 값: ");
			num[i]= sc.nextInt();
			sum += num[i];
		}
		System.out.println("총합: " + sum);
	}

}
