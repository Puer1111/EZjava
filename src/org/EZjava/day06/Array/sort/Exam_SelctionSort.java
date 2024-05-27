package org.EZjava.day06.Array.sort;

public class Exam_SelctionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		선택정렬이란
//		배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
//		특징: 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
//		데이터 양이 많을 때 급격한 성능 저하를 보인다.
//		배열의 n번 인덱스값을 n+1~ 마지막 인덱스 까지 비교함
		// {2,5,4,1,3}
//		result 1 = {1,5,4,2,3}
//		result 2 = {1,2,4,5,3}
//		result 3 = {1,2,3,5,4}
//		result 4 = {1,2,3,4,5}
		int[] arrs = {2,5,4,1,3};
		for (int i =0; i<5; i++) {
			int min = i;
			for(int j = i+1; j<5; j++) {
				if(arrs[min]>arrs[j]) {
					min = j;// 최소값이 정해졌을 떄 min을 arrs[min]으로 구하면 최소값 바뀜.
				}
			}
			int temp = arrs[i]; // 기존 값 temp에 넣어두기
			arrs[i] = arrs[min]; // 기존 보다 작았던 새로운 최소값 왼쪽에 대입
			arrs[min] = temp; // 기존 값 가져오기 최소값과 해당 자리 숫자 스왑
		}
		for(int num : arrs){
			System.out.print(num+ " ");
		}	
	}
}
// 				if(arrs[0]>arrs[1]) {
//					System.out.println("최소값");
//				}
//				if(arrs[0]>arrs[2]) {
//					
//				}
//				if(arrs[0]>arrs[3]) {
//				}
//				if(arrs[0]>arrs[4]) {
//				}
//				int temp = arrs[0];
//				arrs[0] = min;
//				arrs[min]= temp;
//				
//				if(arrs[1]>arrs[2]) {
//					
//				}
//				if(arrs[1]]>arrs[3]) {
//				}
//				if(arrs[1]>arrs[4]) {
//				}
//				int temp = arrs[1];
//				arrs[1] = min;
//				arrs[min]= temp;
//				
//				if(arrs[2]]>arrs[3]) {
//				}
//				if(arrs[2]>arrs[4]) {
//				}
//				int temp = arrs[2];
//				arrs[2] = min;
//				arrs[min]= temp;
//				
//				if(arrs[3]>arrs[4]) {
//				}
//				int temp = arrs[3];
//				arrs[3] = min;
//				arrs[min]= temp;
//			}
//		}
//	
