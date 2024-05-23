package org.EZjava.day05.Array;

public class Exam_HallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		배열의 복사 중 얕은 복사
		 int[] arrs = new int[4];
		 for ( int i =0; i <arrs.length; i++) {
			 arrs[i] = i*i;
			 
		 }
//		 
//		 for-each 문
//		 원래
//		 for(int i =0; i<arrs.length; i++)
		
//		 배열 얕은 Copy --> 배열이 2개가 된게 아니라 같은 배열을 다른 이름으로 보고 있는것
		 int[] copy = arrs;
		 copy[1]= 11;
		 for(int i :arrs) {
			 System.out.println(i+"");
		 }
		 System.out.println();
		 for(int i :copy) {
			 System.out.println(i+"");
		 }
	}

}
