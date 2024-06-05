package org.EZjava.day05.Random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		동전 앞 뒤 맞추기
//		숫자를 입력해주세요: (1.앞면 /2. 뒷면)
//		맞췄습니다.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while (true) {
			System.out.println("숫자를 입력해주세요 (1.앞면 / 2.뒷면 ) :");
			int choice = sc.nextInt();
			if (choice == -1)
				break;

			
			int num = rand.nextInt(2) + 1;
//			int num1 = (int)(Math.random()*2)+1; // math로 하는법
			if (num == choice) {
				System.out.println("맞췄습니다");
			}

			else {
				System.out.println("틀렸습니다");
			}
		}
	}
}
