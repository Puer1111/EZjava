package org.EZjava.day16.Test;

public class CalculatorV2 extends Calculator {
	public double avg(int num1, int num2) {
		return (num1 + num2) / (double) 2;
	}

	public int bigNum(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else if (num2 > num1) {
			return num2;
		} else {
			return 0;
		}
	}
	public int minus(int num1,int num2 ) {
		return num1-num2;
	} // 부모가 추상 이라 추상 클래스 반드시 오버라이딩
}
