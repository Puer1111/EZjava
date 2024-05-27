package org.EZjava.day07.oop.run;

import java.util.Scanner;

import org.EZjava.day07.oop.Book;
import org.EZjava.day07.oop.Circle;
import org.EZjava.day07.oop.Member;
import org.EZjava.day07.oop.Exercise.Rectangle;

public class Run {

	public static void main(String[] args) {
//		Book book = new Book();//기본 생성자 이용해 객체 생성
//								//title , author 모두 비어있다.
//		book.title = "춘향뎐";
//		book.author ="작자미상";
//		

//			Run ex= new Run();
//			ex.oopPractice1();
		Run.oopExercise();
	Run.oopPractice1();
	Math.random();
	
	
	}

	public static void oopPractice1() {
		
		Rectangle rec = new Rectangle();
		rec.height = 4;
		rec.width = 5;
		int area1 = rec.getArea();
		System.out.println("사각형의 넓이는 20 입니다: "+ area1);
		System.out.printf(">>"+rec.height + " " + rec.width+ "\n");
		// heap 영역
		Scanner sc1 = new Scanner(System.in);
		int width= sc1.nextInt();
		int height = sc1.nextInt();
		int result = width * height;
		System.out.println("사각형의 넓이는 " + result + "입니다");
		// stack 영역
		
	}
	public static void constructorEx() {
		
		Circle bintz = new Circle();
//		bintz.radius = 10;
		bintz.setRadius(10);
	
		
	}
	public static void oopExercise() {
		// Circle의 instance 를 이용하여
//		이름이 달덩이, 반지름은 5인 
//		Circle 의 넓이를 출력해보세요
		
		Circle circle = new Circle(); // circle = 참조변수
		circle.name = "달덩이";
		circle.radius = 5;
		double area= circle.getarea();
		circle.getarea();
		System.out.println(area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "던킨";
		area= donut.getarea();
		System.out.println(area);
		
	}
	
	public static void memberPractice() {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member(); // 생성자
		member.name = "일용자";
		member.age = 33;
		member.job = "의사";

		Member member2 = new Member();
		member2.name = "이용자";
		member2.age = 22;

		System.out.println(member.name);
		System.out.println(member.job);
	}
}

