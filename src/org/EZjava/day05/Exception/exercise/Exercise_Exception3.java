package org.EZjava.day05.Exception.exercise;

public class Exercise_Exception3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		배열의 인덱스가 범위를 벗어날 때
//		발생하는ARayIndexOutOfBoundsException을 처리하는 프로그램 작성
//	
		int nums[] = new int [5];
		
		try {
			System.out.println(nums[6]);
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 영역을 벗어났습니다");
			}
	}

}
