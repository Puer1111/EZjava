package org.EZjava.day05.Exception.exercise;



public class Exercise_Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문자열을 정수로 변환할 떄
//		발생하는 numberFormatException 을 
//		처리하는 프로그램을 작성하라
		String[]words = {"102","2.03"};
		try {
				int num = Integer.parseInt(words[1]);
				System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("Error");
		}
	}
}
