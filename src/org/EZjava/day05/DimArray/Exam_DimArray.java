package org.EZjava.day05.DimArray;

public class Exam_DimArray {

	public static void main(String[] args) {
		int num = 0; // 변수
		int[] nums = new int[10];// 배열

		int[][] dimNums = new int[5][4]; // 2차원 배열
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : " + dimNums[0].length);

		int[][] arrs = new int[5][4]; // 행 5 열 4 배열 생성
		int j = 1;
		for (int i = 0; i < arrs.length; i++) { // 행 길이만큼 증가 i행 증가
			for (int k = 0; k < arrs[i].length; k++) { // 열 길이만큼 k열 증가
				arrs[i][k] = j; // i열 k행 에 j라는 값 대입
				j++; // j 1씩 증가
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int k = 0; k < arrs[i].length; k++) {
				System.out.println(arrs[i][k]);
			}
		}
//			for(int[] arr :arrs) {
//				for(int k: arr) {
//				}
//
//				System.out.println(k + ""); //for - each 로도 가능
	}
}
