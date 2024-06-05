package org.EZjava.day04.Control.Loop;

public class Exam_Fordouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		중첩 for문 - for문 안에 for문이 있다.
//		문법
//		for(조건식) {for () {}}

		
//		복합대입연산자
//		i=i+1
//		i++
//-->>>	i+=1
//		
//		
//		
//		1. j는 1일때 시작해서
//		2. 안에있는 for문으로 2단 출력
//		4. j는 3이 되어서
//		5. 안에 있는 for문으로 3단출력
//		7. 4번에서 j+1 후 반복
		for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.println(i + "x" + j +"=" + i*j);
			}
		}
//		3.2단 출력이 모두 끝나면 바깥 for 문 증가식 동작
//		6.3단출력 끝 . 바깥 동작
//		
		for(int j=0; j<3; j++) {
			for(int i = 2; i<10; i++) {
				System.out.println( "2 * " + i +" = " + i*2);
			}
		}
		
		
		int dan = 2;
		for(int j =0; j<3; j++) {
			for(int i = 2; i<10; i++) {
				System.out.println( dan +" * " + i +" = " + i*dan);
			}
				dan++;
		}
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
//
//	
//		System.out.println("3 * 2 = 6");
//		System.out.println("3 * 3 = 9");
//		System.out.println("3 * 4 = 12");
//		System.out.println("3 * 5 = 15");
//		System.out.println("3 * 6 = 18");
//		System.out.println("3 * 7 = 21");
//		System.out.println("3 * 8 = 24");
//		System.out.println("3 * 9 = 27");
//		
	}

}
