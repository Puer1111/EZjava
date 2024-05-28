package org.EZjava.day08.oop.student;

import java.util.Scanner;

public class ViewStudent {


	Scanner sc = new Scanner(System.in);
		public int printMenu() {
			
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택 >>");
			int choice = sc.nextInt();
			return choice;
		}
		
		public void displayMsg(String message) {
			System.out.println(message);
		}


	}


