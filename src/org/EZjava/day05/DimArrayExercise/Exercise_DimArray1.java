package org.EZjava.day05.DimArrayExercise;

public class Exercise_DimArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrs = new int[5][5]; // 행 5 열 5 배열 생성
		int j = 1;
		for (int i = 0; i < arrs.length; i++) { // 행 길이만큼 증가 i행 증가
			for (int k = 0; k < arrs[i].length; k++) { // 열 길이만큼 k열 증가
				arrs[i][k] = j; // i k행 에 j라는 값 대입
				j++; // j 1씩 증가
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int k = 0; k < arrs[i].length; k++) {
				System.out.print(arrs[i][(arrs.length-1)-k]+"\t");
			}
			System.out.println();
//			거꾸로
		}
//		선생님 ver.
//		int[][]arrs1 = new int [5][5];
//		int k =1;
//		for(int i =0; i<5; i++) {
//			for(int j =4; j>=0; j--) {
//				arrs[i][j]=k;
//				k++;
//			}
//		}
//		for(int[]arr:arrs) {
//			for(int num: arr) {
//				System.out.println(num+"\t");
//			}
//			System.out.println();
//		}
	}
}

