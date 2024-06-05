package org.EZjava.day11.oop.member;

import java.util.Scanner;

public class ViewMember {

	

	public int mainmenu() {
		Scanner sc =new Scanner(System.in);
		System.out.println("====회원관리 프로그램====");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원정보 조회");
		System.out.println("4. 회원정보 수정");
		System.out.println("5. 회원정보 삭제");
		System.out.println("메뉴선택: ");		
		int input = sc.nextInt();
		return input;
		
	}

	public void displayMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===회원 가입===");
		System.out.println("이름: ");
		String name= sc.next();
		System.out.println("이메일:  ");
		String email=sc.next();
		System.out.println("전화번호: ");
		String phone = sc.next();
		sc.nextLine();
		System.out.println("주소: ");
		String address = sc.nextLine();
		
		Member member = new Member(name, phone, email, address);
		
		return member;
	}

	public void printAllMembers(Member[] members) {
		// TODO Auto-generated method stub
		System.out.println("====회원 정보 출력====");
		for(Member member : members) {
			if(member != null) {
				System.out.println(member.toString());
			}
		}
	}

	public String inputEmail(String category) {
		Scanner sc = new Scanner(System.in);
			System.out.println(category + "할 이메일 입력: ");
		String email = sc.next();
		return email;
	}

	public void printOneMember(Member member) {
		System.out.println("====회원 검색 결과====");
		System.out.println("이름:"+member.getName());
		System.out.println("전화번호:"+member.getphone());
		System.out.println("주소:"+member.getAddress());
		System.out.println("이메일: "+ member.getEmail());
	}
// 새로운 객체 만들어서 수정하기
	public Member modifyMember(String email) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===회원 가입===");
		System.out.println("이름: ");
		String name= sc.next();

		System.out.println("전화번호: ");
		String phone = sc.next();
		sc.nextLine();
		System.out.println("주소: ");
		String address = sc.nextLine();
	
		Member member = new Member(name, phone, email, address);
		return member;
	}
// 객체 배열에서 객체를 이용한 수정
	public void modifyMember(Member member) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===회원 가입===");
		System.out.println("이름: ");
		String name= sc.next();
		System.out.println("이메일:  ");
		String email=sc.next();
		System.out.println("전화번호: ");
		String phone = sc.next();
		sc.nextLine();
		System.out.println("주소: ");
		String address = sc.nextLine();
		
		member.setName(name);
		member.setphone(phone);
		member.setAddress(address);
		
	}
	
//	 위 inputemail과 내용이 비슷해 하나로 합침


}
