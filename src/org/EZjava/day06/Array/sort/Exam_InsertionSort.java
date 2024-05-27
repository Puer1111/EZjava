package org.EZjava.day06.Array.sort;

public class Exam_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삽입 정렬
//		정렬 알고리즘 중 하나, 가장 간단하고 기본인 알고리즘
//		배열의 N번 인덱스 값을 n-1번에서 0 번 인덱스 까지 비교
//		N은 1 시작 
//		{2,5,4,1,3}
//		5 - 2 를 비교했는데 2가 더 작기에 바꿀 필요 X

//		4를  5 , 2 순으로 비교
//		 4 - 5 비교시 4가 더 작기에 2,4,5
//		 4 - 2 비교시  --> 2가 더 작기에 변동X
//		결과: 2, 4, 5, 1, 3

//		1을 5, 4, 2 순으로 비교
// 		1 - 5 비교시 1이 더 작기에 2, 4, 1, 5, 3
//		1 - 4 비교시 1이 더 작기에 2, 1, 4, 5, 3
//		1 - 2 비교시 1이 더 작기에 1, 2, 4, 5, 3
//		결과 : 1, 2, 4, 5, 3

//		3을 5, 4, 2, 1 순으로 비교
//		3 - 5 비교시 3이 더 작기에 1, 2, 4, 3, 5
//		3 - 4 비교시 3이 더 작기에 1, 2, 3, 4, 5
//		그 아래는 3이 더 크기에 변동X

		int arrs[] = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arrs.length; i++) { // 비교할 애들 개수
			for (int j = i; j >= 1; j--) {  // 비교하는 경우 수
				
				if (arrs[j - 1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j - 1];
					arrs[j - 1] = temp;
				}
			
			}
		}
		// 정렬된 결과 출력
		for (int nums : arrs) {
			System.out.printf(nums + " ");
		}
		System.out.println();
//			if(arrs[0]>arrs[1]) {
//				int temp = arrs[1];
//				arrs[1]= arrs[0];
//				arrs[0]= temp;
//			}
//			if(arrs[1]>arrs[2]) {
//				int temp = arrs[2];
//				arrs[2]= arrs[1];
//				arrs[1]= temp;
//			}
//			if(arrs[0]>arrs[2]) {
//				int temp = arrs[2];
//				arrs[2]= arrs[0];
//				arrs[0]= temp;
//			}
//			1 - 4 , 1 - 5 , 1 - 2 비교
//			i가 3일때
//			if(arrs[2]>arrs[3]) {
//				int temp = arrs[3];				
//				arrs[3]= arrs[2];
//				arrs[2]= temp;
//			}
//			if(arrs[1]>arrs[3]) {
//				int temp = arrs[3];				
//				arrs[3]= arrs[1];
//				arrs[1]= temp;
//			}
//			if(arrs[1]>arrs[2]) {
//				int temp = arrs[2];				
//				arrs[2]= arrs[1];
//				arrs[1]= temp;
//			}
//		}
		// 2, 5, 4, 1, 3
//			5랑 있는 값이랑 비교
//			i=1 
//			j=0
//			arrs[1과] arrs[0]비교
//			arrs[0]이 크면 자리 교환
//			i= 2
//			j= 0, 1
//			arrs[2] 와 arrs[1] 비교
//			arrs[1]이 크면 교환
//			arrs[2]와 arrs[0]비교
//			arrs[0]이 크면 교환			
//			i= 3
//			j= 0, 1 ,2 
//			arrs[3] 와 arrs[2] 비교
//			arrs[2]이 크면 교환
//			arrs[3]와 arrs[1]비교
//			arrs[1]이 크면 교환
//			arrs[3]와 arrs[0]비교
// 			arrs[0]이 크면 교환
//			i= 4
//			j= 0, 1 ,2 ,3  
//			arrs[4] 와 arrs[3] 비교
//			arrs[3]이 크면 교환
//			arrs[4]와 arrs[2]비교
//			arrs[2]이 크면 교환
//			arrs[4]와 arrs[1]비교
// 			arrs[1]이 크면 교환
//			arrs[4]와 arrs[]비교
// 			arrs[0]이 크면 교환

		int arrs1[] = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arrs1.length; i++) {
			for (int j = i; j >= 1; j--) {
				if (arrs1[j - 1] > arrs1[j]) {
					int temp = arrs1[j];
					arrs1[j] = arrs1[j - 1];
					arrs1[j - 1] = temp;
				}
			}
		}
		for (int num : arrs1) {
			System.out.print(num + " ");
		}
	}
}