package org.EZjava.day12.Collection.list;

public class IntList {
	int[] nums;
	private int size;

	public IntList() { // 필드 , 메소드 초기화
		nums = new int[3];
		size = 0;
	}

	public void add(int num) {
		nums[size]=num;
		size++;
	}
// 전체값을 가져올 땐 매개변수 필요 x 단, 하나의 값은 그 위치가 필요하기에 매개변수 필요. ex) nums 값 다 가져오면 매개 변수 필요 x

	//	public int[] get(int size) {
//		return nums;// 전체값
//	}
	public int get(int index) {
		return nums[index];
	}// 해당 단일 값

	public int size() {
		return size;
	}

	public void clear() {
	// 1. for 문으로 다 없애기
	
		//2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	
	}
}
