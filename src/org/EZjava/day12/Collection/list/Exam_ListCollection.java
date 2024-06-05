package org.EZjava.day12.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {

	public static void main(String[] args) {

		// List 인터페이스 존재
//		List 인터페이스를 구현하여 만든 클래스 존재
//		ArrayList클래스라고 하면 이것을 사용

		List<String> list = new ArrayList<String>();
		list.add("하2");
		list.add("하3");
		list.add("하4");
		list.add("하4");
		list.add("하5");

		System.out.println(list.get(0));
		System.out.println(list.get(4));

		int listsize = list.size() - 1;
		System.out.println("마지막 값: " + list.get(listsize));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		list.remove(listsize);// 마지막값 지우기
		list.remove(2);
		list.clear();
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println("isEmpty(): " + list.isEmpty()+ " size(): "+ list.size());
	}

		public void genericSample() {
		GenericList<String> strList=new GenericList<String>();
		
		strList.add("하이");
		strList.add("누누");
		strList.add("아아");
		
		String a1 = strList.get(0);
		String a2 = strList.get(1);
		String a3 = strList.get(2);
//		형변환 안해도 <> 안에 타입 넣고 쓰면 됨.
}
//		/////////////////////////////////////////////////////

	public void objListSample() {
		ObjectList obj = new ObjectList();
		obj.add("종강");
		obj.add("프로젝트");
		obj.add("개강");
		
		String project = (String)obj.get(0);
		String end = (String)obj.get(1);
		String start = (String)obj.get(2);
		

		ObjectList objlist = new ObjectList();

		objlist.add(5.7);
		objlist.add(1023);
		objlist.add("하이");
	
		double start1 = (double) objlist.get(0);
		int end1 = (int) objlist.get(1);
		String msg = (String) objlist.get(2);
		System.out.println(start1);
		System.out.println(end1);
		System.out.println(msg);

	}

	public void intListSample() {
		IntList nums = new IntList();
		nums.add(5);
		nums.add(1);
		nums.add(7);

		System.out.println(nums.get(2));
		System.out.println("크기 : " + nums.size());
		nums.clear();
		System.out.println("크기: " + nums.size());
}
}
