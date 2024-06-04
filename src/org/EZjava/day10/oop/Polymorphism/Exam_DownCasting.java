package org.EZjava.day10.oop.Polymorphism;

class Person {
	String name;
	String id;

	public Person() {
	}

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

}

class Student extends Person {
	String grade;
	String department;

	public Student() {
	}

	public Student(String grade, String department) {
		this.grade = grade;
		this.department = department;
	}
}

public class Exam_DownCasting {
	public static void main(String[] args) {

		Person p = new Student();// 업캐스팅 : 상속 되야 가능
		
		System.out.println(p.name);
		System.out.println(p.id);
		
	//	System.out.println(p.grade); // 클래스 Person 의 P 이기 떄문에 
	//	System.out.println(p.department);// 자식꺼는 확인 할 수 없다.
	
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).id);// 다운캐스팅 
	}
}
