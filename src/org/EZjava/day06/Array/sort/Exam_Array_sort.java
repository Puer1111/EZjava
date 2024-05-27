package org.EZjava.day06.Array.sort;

public class Exam_Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		정렬
//		크기가 5인 배열. 24 5 7 10 23 
//		7 24 5 23 10 -> 5 7 10 23 24
//		01.정렬 알고리즘
//		알고리즘이란: 문제해결을 하기 위한 절차나 방법,
//		프로그래밍 언어로 어떻게 해결할 것인가를 고민

//		02. 정렬 알고리즘 종류
//		1.삽입정렬
//		2.선택정렬
//		3.버블정렬
//		4.퀵정렬
//		5.병합정렬
//		7 24 5 23 10 -> 5 7 10 23 24
//		자리바꿈 발생
//		1. 자리바꿈은 어떻게 해결 할 것인가
//		2. 어떤 조건이 만족하면 바꿀 것인가
//		int num1 = 5;
//		int num2 = 7;
////		num1 = 7 num2 =5 가 들어가도록 해야한다
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//		System.out.printf("num1 : %d , num2 : %d", num1, num2);

		
		int nums[] = {2,1,3};
		int temp1 = nums[0];
		nums[0] = nums[2];
		nums[2]=temp1;
//		3 ,1 ,2
		temp1 = nums[1];
		nums[1]= nums[2];
		nums[2]= temp1;
		
		for(int num : nums) {
		System.out.printf(num+ " ");
		}
		System.out.println();
		
		
		int [] opens = {24,5,7};
		// 5, 7, 24
		int temp2 = opens[0];
		opens[0] = opens[1];
		opens[1]=temp2;
		// 5, 24 ,7
		temp2
		= opens[2];
		opens[2]= opens[1];
		opens[1]= temp2;
		
		for(int open : opens) {
		System.out.printf(open+ " ");
		}
		System.out.println();
//		 5, 7, 24
		temp2 = opens[0];
		opens[0] = opens[2];
		// 24 , 7, 5 temp2 = 5
		opens[2] = temp2 ;
		temp2 = opens[1];
		opens[1] = opens[2];
		opens[2] = temp2;
		
		for(int open1 : opens) {
			System.out.printf(open1+ " ");
		}
		//24, 5, 7
		
		
		
		
		
	
	
	}

}
