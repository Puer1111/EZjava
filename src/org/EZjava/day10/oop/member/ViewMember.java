package org.EZjava.day10.oop.member;

import java.util.Scanner;

public class ViewMember {

	Scanner sc = new Scanner(System.in);

	public int printMenu() {

		System.out.println("=====회원가입 프로그램======");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원정보보기");
		System.out.println("4. 종료");
		System.out.println("메뉴 선택: ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}

	public Member inputMember() {
		
		
		System.out.println("=====회원 가입=====");
		System.out.println("아이디: ");
		String MemberId= sc.next();
		System.out.println("비밀번호: ");
		String Memberpw= sc.next();
		System.out.println("이름: ");
		String Membername= sc.next();
		System.out.println("나이: ");
		int Memberage = sc.nextInt();
		System.out.println("이메일: ");
		String MemberEmail= sc.next();
		System.out.println("전화번호: ");
		String MemberPhone= sc.next();
		sc.nextLine();
		System.out.println("주소: ");
		String MemberAddress = sc.nextLine();
		
		Member member = new Member();
		member.setMemberId(MemberId);
		member.setMemberpw(Memberpw);
		member.setMemberAddress(MemberAddress);
		member.setMemberAge(Memberage);
		member.setMemberEmail(MemberEmail);
		member.setMemberPhone(MemberPhone);
		member.setMembername(Membername);
		return member;
	}
	public void displayMemberList(Member[] members) {
		for(Member member: members) {
			System.out.println("=====회원 정보 보기=====");
			System.out.printf("아이디: %s , 이름: %s , 나이: %d  ,주소: %s ", member.getMemberId(),
					member.getMembername(),member.getMemberAge(),member.getMemberAddress());
			
		}
	}
	public void displayMember(Member member) {
		System.out.println("=====회원 정보 보기=====");
		System.out.printf("아이디: %s , 이름: %s , 나이: %d ,주소: %s ", member.getMemberId(),
				member.getMembername(),member.getMemberAge(),member.getMemberAddress());
	}
	

	public String inputMemberId() {
		System.out.println("검색할 아이디 입력:");
		String memberId = sc.next();
		return memberId;
	}
	
	
	
}
