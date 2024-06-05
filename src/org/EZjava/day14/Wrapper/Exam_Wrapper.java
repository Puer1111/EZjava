package org.EZjava.day14.Wrapper;

public class Exam_Wrapper {
	public static void main(String[] args) {
		int num = 10;
		Integer su = null;
		su = Integer.valueOf(57);
		su = 57; // 둘다 가능 -> 이런걸 Auto Boxing 이라 함
		num = su.intValue();
		num = su; // -> Auto unBoxing 이라 함
		// int -> Integer
		// double-> Double
		// char -> Character
		// boolean -> boolean
		String openDay = "20240507";
		int openDate = Integer.parseInt(openDay); // 문자열 정수화 parseInt

		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('b'));
		char c1 = '5', c2 = 'F';
		if (Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if (Character.isDigit(c2)) {
			System.out.println(c2 + "은 영문자");
		}
		/////////////////////////////////////////////////////////////////////
		// 문자열로 바꾸기
		// 1.String.valueOf(1)
//		2.+"" 붙이기
//		3. .toString()
		System.out.println(String.valueOf(1));
		System.out.println(1 + "");
		System.out.println(Integer.valueOf(1).toString());

	}
}
