package org.EZjava.day02.Operatior;

public class Exam_Comparison {
	public static void main(String[] args) {
//		비교 연산자 TODO Auto-generated method stub
//		더 이상 = 는 equal 이 아니다.
//		equal 은 == 다.
		int num1 =50;
		int num2 = 30;
		boolean result ;
		result = (num1 > num2 );
		result = (num1 < num2 );
		result = (num1 == num2 );
		result = (num1 != num2 );
		System.out.println("result :" + result);
	}

}
