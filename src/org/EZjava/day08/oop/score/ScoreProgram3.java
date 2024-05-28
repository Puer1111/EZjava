package org.EZjava.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(); // student 파일과 결합
		end : // while true 해제
		while(true) {
			int choice = student.printMenu();
			switch(choice) {
			case 1 :
				student.inputScore();
				break;
			case 2 :
				student.printScore();
				break;
			case 3 :
				student.displayMsg("프로그램을 종료합니다");
				break end;
			default :
				student.displayMsg("1~3 사이 수를 입력하세요");
			}
		}
	}

}
