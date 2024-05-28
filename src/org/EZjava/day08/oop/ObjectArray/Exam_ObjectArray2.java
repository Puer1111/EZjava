package org.EZjava.day08.oop.ObjectArray;

import java.util.Scanner;

public class Exam_ObjectArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			여러개의 책이 존재하는데 그 책의 정보를 여러개 저장하려고 함
//			책은 3권까지 저장할 수 있도록 하고, 제목과 저자만 입력받아 저장할 수 있는
//			프로그램을 작성하시오

		Book bkarrs[] = new Book[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < bkarrs.length; i++) {
			System.out.println(">>");
			String title = sc.nextLine();
			System.out.println(">>");
			String Author = sc.nextLine();

			bkarrs[i] = new Book(title,Author);

		}
		for(Book book : bkarrs) {
			System.out.println(book.toString());
		}
	}

}
