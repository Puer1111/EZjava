package org.EZjava.day11.oop.objectex;

class Member{
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Member() {}
	public Member(String name, int age,String email, String phone ,String address) {
		this.address=address;
		this.age = age;
		this.email = email;
		this.name = name;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: "+ name +",나이"+age+" , email: ,전화번호: "+phone+",주소: "+address;
	}
	
	}



public class Exam_ObjectPrtoperty {

	public static void print(Object obj) {//object 클래스는 어디든 상속 되는 최상위 클래스}
	System.out.println("클래스 이름; "+ obj.getClass().getName());
	System.out.println("해시 코드값: "+obj. hashCode());
	//의미는 데이터로 만들어 출력하고 싶다면 무조건 오버라이딩
	System.out.println("객체를 문자열로 만들어 출력: " + obj.toString());
//	System.out.println("객체 출력 : "+ obj );//To string 생략 가능
	}								// 객체 출력시 toString()의 결과로 출력


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new Member("일용자 ", 11 ,"kyuser.naver.com","01012345678","서울시 어쩌구"));
		print(new Member());
		
		String javaStr = "Java"; // 
		String javaStr2 = new String ("java"); //둘이 주소 다름 
		String javaStr3 = "Java";
//		Q1
//		if(javaStr == javaStr3) -> T , 주소가 똑같기 떄문이다 (feat . 상수풀)
//		if(javaStr3 == javaStr2) ->F 주소가 다르다 Str2 는 new string 에 만들었기 떄문
//		if(javaStr3 =="java")->T
//		if(javaStr == "javA")-> F
		System.out.println("javaStr: "+ javaStr + ",javaStr2: "+ javaStr2);
//		if(javaStr2 == "Java") 
		 // javaStr 은 그대로 "JAVA"라서 조건이 맞지만 str2 는 아니다
//		if(javaStr2.equals(javaStr2)) {
		if("Java".equals(javaStr2)) { // 문자열 비교는 equals , equals 는 object 클래스의 메소드
		System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
	}}
//	