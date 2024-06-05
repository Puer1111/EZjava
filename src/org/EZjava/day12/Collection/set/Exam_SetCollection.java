package org.EZjava.day12.Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.EZjava.day12.Collection.student.Student;

public class Exam_SetCollection {
// Collection: list, set ,map - > 저장소
//		자료구조의 특성에 따라 선택하여 사용.
//		Set
//	실생활 중복 허용 x = 복권번호 , 주민등록번호 , 변수이름 etc.. 
//	수학의 집합 : 순서 중요 x 중복 허용 x 
//	중복이 있는 데이터를 set에 넣으면 중복이 제거됨
//	순서가 있는 경우 index 활용 할 수 있으나 set처럼 순서가 없다면 지시자(Iterator) 활용		
//	지시자  import 해야함

	public static void main(String[] args) {
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(new Student("하이",80,90));
		stdSet.add(new Student("하3",70,90));
		stdSet.add(new Student("하4",50,90));
		stdSet.add(new Student("하이",80,90));
		System.out.println("크기:"+ stdSet.size());
		
		Iterator<Student> id = stdSet.iterator();
		while(id.hasNext()) {
			System.out.println(id.next().toString());
		}
	}

	public void setSample() {
		Set<String> strSet = new HashSet<String>();
		strSet.add("체링");
		strSet.add("딸기");
		strSet.add("사과");
		strSet.add("수박");
		strSet.add("포도");
		strSet.add("딸기");
		System.out.println("크기: " + strSet.size());
//	결과는 5 이유는 중복허용x 
		Iterator<String> it = strSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
