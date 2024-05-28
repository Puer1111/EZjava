package org.EZjava.day08.oop.ObjectArray.student;

import java.util.Scanner;

public class StudentApp {

	static Student students[] = new Student[3];

	public static void main(String[] args) {
		ManageStudent msg = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end:
		while (true) {
			int input = view.printMenu();
			switch (input) {
			case 1:
//				msg.inputInfo();
				students = view.displayInput();
				msg.inputInfo(students);
				break;
			case 2:
				students=msg.printInfo();
				view.displayInfo(students);
//				msg.printInfo();
				break;

			case 3:
				view.displayMsg("프로그램을 종료합니다");
				
				break end;
			default:
				view. displayMsg("1~3사이의 수를 입력해주세요");
			}
		}
	}
}
