package org.EZjava.day04.PracticeArray;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		if(num<3 || num%2==0) {
			System.out.println("다시 입력하세요");
		}
		else {
			for(int i=0; i<num; i++) {
				Arrays.sort(nums);
			}
			
		}
	}

}

