package org.EZjava.day16.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operator {
	public void plus() {
		int[] num = new int[2];
		for (int i = 0; i < num.length; i++) {
			num[i] = inputNumber(i);

		}
		System.out.println("두수의 합: " + (num[0] + num[1]));
	}

	public int inputNumber(int i) {

		Scanner sc = new Scanner(System.in);
		int inputNumber;
		while (true) {
			try {
				System.out.print((i + 1) + "번쨰 정수를 입력하시오");
				inputNumber = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
//				e.printStackTrace();
				System.out.println("잘못 입력");
				sc.next();

			}

		}
		return inputNumber;
	}

}
