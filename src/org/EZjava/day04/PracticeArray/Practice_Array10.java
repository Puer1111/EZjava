package org.EZjava.day04.PracticeArray;

import java.util.Scanner;

public class Practice_Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 (- 포함) :");
		String idNum = sc.next();
		char idNums[] = new char[idNum.length()];
		for (int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);
		}
//		idNums배열 생성 -> 칸수는 입력하는 입력값만큼 , 생성한 배열칸에 입력값 대입
		char[] copy = new char[idNums.length];
		for (int i = 0; i < idNums.length; i++) {
			copy[i] = idNums[i];
//	 복사용 새로운 배열 생성 기존 배열 값 복사 		
			if (i >= 8) {
				copy[i] = '*';
			} else {
				copy[i] = idNums[i];
			}
		}
//		주민등록번호 성별자리 이후 *대입 위한 조건문
		for(char num:copy) {
			System.out.print(num);
		}

	}

}
