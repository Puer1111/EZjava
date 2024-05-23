package org.EZjava.day05.Array;

public class Exam_DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열 복사 중 깊은 복사
		int[] arrs = {0,1,4,9};
//		int [] copy = arrs;  // 얕은 복사
		int []copy = new int[4]; // 깊은 복사 새로운 배열 칸 생성
		for(int i = 0; i<arrs.length; i++) {
			copy[i]= arrs[i];
			
		}
		copy[1]= 11;
		for(int i :copy) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i :arrs) {
			System.out.print(i+"\t" );
		}
	}

}
