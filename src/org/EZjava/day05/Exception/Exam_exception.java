package org.EZjava.day05.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다" 를 출력하고
//		 다시 입력받는 플그램을 작성하여라
//	
		Scanner sc = new Scanner(System.in);
		while (true) {
			int result =0;
			int num1=0 , num2 =0;
			try {
				System.out.print("첫번째 정수 입력: ");
				num1 = sc.nextInt();
				System.out.print("두번째 정수 입력: ");
				num2 = sc.nextInt();
				 result = num1 / num2;
			} catch (ArithmeticException e) {
// 			 ArithmeticException 0으로 나눴을떄 에러 코드
//				e.printStackTrace();
				System.out.println("0으로 나눌 수 없다");
				continue;
			} catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨습니다");
				
				sc.next(); // 첫번째 입력에서 문자를 입력하고 에러가 난뒤
				//입력했던 문자가 처리가 되지 않아서 첫번째 입력에서 계속 머물게 된다.	
//				그리하여 입력값을 반복하게 하지 않기 위해 sc.next()에 catch 한다
				continue;
			}
			System.out.printf("%d를 %d로 나누면 몫은 %d입니다\n", num1, num2, result);
		}
	}
}
