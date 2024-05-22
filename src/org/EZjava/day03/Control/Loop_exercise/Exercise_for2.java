package org.EZjava.day03.Control.Loop_exercise;

public class Exercise_for2 {

	public Exercise_for2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			1부터 10까지의 덧셈을 표시하고 합도 구하시오
//		1+2+3+4+5+6+7+8+9+10 = 55
		int sum = 0;
		int i = 0;
		
		for (i=0; i<11; i++) {
			sum += i;
			if(i==10) {
				System.out.print(i+"=");
			}else {
					System.out.print(i+"+");
				
			}
		}
		System.out.println(sum);
	}
}
