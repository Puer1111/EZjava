package org.EZjava.day16.Test;

public class MemberRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Member m = new Member();
m.setAddress(" 서울");
m.setAge(25);
m.setHobby("dkdk");
m.setName("홍길");

System.out.println("이름; " + m.getName());
System.out.println("이름; " + m.getAddress());
System.out.println("이름; " + m.getHobby());
System.out.println("이름; " + m.getAge());
	}

}
