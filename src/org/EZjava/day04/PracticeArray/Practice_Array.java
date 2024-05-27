package org.EZjava.day04.PracticeArray;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		int nums[];
		nums = new int[10];

		for(int i =0; i<10; i++) {
			nums[i]=(i+1);
			System.out.println(nums[i]);
		}
	}
		public void practice2()	{
			int nums[];
			nums = new int[10];

			for(int i=9; i>=0; i--) {
				nums[i]=(i+1);
				System.out.println(nums[i]);
			}
		}
		public void practice3()	{
			Scanner sc = new Scanner(System.in);
			System.out.println("양의 정수: ");
			int input = sc.nextInt();
			
			if(input>0) {
				int[]arrs = new int [input];
				for(int i =1; i<=input; i++) {
					arrs[i-1]=i;
					System.out.println(arrs[i-1]+"");
				}
				System.out.println();
				for(int i = 0; i<input; i++) {
					arrs[i]=i+1;
					System.out.println(arrs[i]+"");
			}
			}
		}
		public void practivce4()	{
			String arry[];
			arry = new String[5];
			String[]fruits={"사과","귤","포도","복숭아","참외"};
			
			for(int i =0; i<fruits.length ;i++) {
				if(fruits[i].equals("귤")) {
					System.out.println(fruits[i]);
					break;
				}
			}
		
		}
		public void practice5()	{
			Scanner sc = new Scanner(System.in);

			System.out.println("문자열: ");
			
			String str = sc.next(); // 문자열 입력
			int count=0;
			int size = str.length(); // 입력받은 문자열의 길이
			
			char[] words = new char[str.length()]; // 만들어진 문자배열은 입력한 문자열의 길이만큼
//			words[1]= str.charAt(0);
//			words[2]= str.charAt(1);
//			words[3]= str.charAt(2); // 이러한 작업을 문자열의 길이만큼 반복
			
			for (int i = 0; i <words.length; i++) {
				words[i] = str.charAt(i);
			}
			
			System.out.println("검색할 문자: ");
			
			char search = sc.next().charAt(0);
			System.out.println("application에 i가 존재하는 위치 (인덱스): ");
			for (int i = 0; i <words.length; i++) {
				if (words[i] == search) {
					System.out.print(i + "");
					count++;
				}
			}
				System.out.println();
				System.out.println("i 개수: " + count);
		}
		public void practice6()	{
			Scanner sc = new Scanner(System.in);
			System.out.println("0~6사이 숫자 입력: ");
			int num = sc.nextInt();

			if (num < 0 || num > 6) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				char[] weeks = {'월','화','수','목','금','토','일'};
				System.out.println(weeks[num]+"요일");
			}
			// String arrys[] = { "월", "화", "수", "목", "금", "토", "일" };

		}
		public void practice7()	{
			Scanner sc = new Scanner(System.in);
			int arry = sc.nextInt();
			int num[] = new int[arry];
			int sum = 0;
			for(int i = 0; i< arry; i++) {
				System.out.print("배열"+ i +"번째 인덱스에 넣을 값: ");
				num[i]= sc.nextInt();
				sum += num[i];
			}
			System.out.println("총합: " + sum);
		}
		public void practice8()	{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int[] nums = new int[num];
			if(num<3 || num%2==0) {
				System.out.println("다시 입력하세요");
			}
			else {
				for(int i=0; i<num; i++) {
					Arrays.sort(nums);
				}
				
			}
		}
		public void practice9()	{
			
		}
		public void practice10(){
			Scanner sc = new Scanner(System.in);
			System.out.print("주민등록번호 (- 포함) :");
			String idNum = sc.next();
			char idNums[] = new char[idNum.length()];
			for (int i = 0; i < idNums.length; i++) {
				idNums[i] = idNum.charAt(i);
			}
//			idNums배열 생성 -> 칸수는 입력하는 입력값만큼 , 생성한 배열칸에 입력값 대입
			char[] copy = new char[idNums.length];
			for (int i = 0; i < idNums.length; i++) {
				copy[i] = idNums[i];
//		 복사용 새로운 배열 생성 기존 배열 값 복사 		
				if (i >= 8) {
					copy[i] = '*';
				} else {
					copy[i] = idNums[i];
				}
			}
//			주민등록번호 성별자리 이후 *대입 위한 조건문
			for(char num:copy) {
				System.out.print(num);
			}

		}
		public void practice11(){}
		public void practice12(){}
			
			
	}
