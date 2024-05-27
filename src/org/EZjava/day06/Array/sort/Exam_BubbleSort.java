package org.EZjava.day06.Array.sort;

public class Exam_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 버블 정렬 인접한 두개의 원소를 검사하여 정렬하는 방법 구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할 때 가장 바름 기본적으로 다른
		 * 정렬에 비해서 속도가 느린편이며 역순으로 정렬할 때 가장느림 {2,5,4,1,3}
		 * 
		 * 첫번째 결과 예측= { , , , , 5} 
		 * {2,5,4,1,3} 
		 * {2,4,5,1,3} 
		 * {2,4,1,5,3} 
		 * 결과:{2,4,1,3,5}
		 * 
		 * 두번째 예측{, , ,4,5} 
		 * {2,4,1,3,5} 
		 * {2,1,4,3,5} 
		 * 결과:{2,1,3,4,5}
		 * 
		 * 세번째 예측{, , 3,4,5} 
		 * {2,1,3,4,5} 
		 * 결과:{1,2,3,4,5}
		 * 
		 * 네번째 예측{,2,3,4,5}
		 * {1,2,3,4,5} - 끝 -
		 */
		int arrs[] = { 2, 5, 4, 1, 3 };
		for (int i = 0; i < arrs.length - 1; i++) { // i 결과 수
			for (int j = 0; j < (arrs.length - 1) - i; j++) {// j 는 교환 수
				// 비교하는 코드
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j + 1];
					arrs[j + 1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		for(int num : arrs) {
			System.out.println(num+" ");
		}
	}
}
