package org.EZjava.day09.oop.Overriding;

public class Exam_Overriding {

	static void paint(Shape shape) {
		// Shape shape = new Shape();
		// Shape shape = new Circle();
		// Shape shape = new Line();
		// Shape shape = new Rectangle();
		// 업캐스팅 으로 shape 상속받은 애들은 가능
		shape.draw();
	}
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		paint(shape);
		Circle circle = new Circle();
		paint(circle); // 업캐스팅
		Line line = new Line();
		paint(line);
		
		
		/*
		 * 오버라이딩
		 * 1. 오버라이딩은 상속관계에서 사용
		 * 2. 오버라이딩은 다 똑같다(접근 지정자 , 반환형,메소드명 ,매개변수 갯수와 타입)
		 * 실행문장만 재정의하는 것
		 * 3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음
		 * //
//		 */	
//		Shape shape = new Shape();
//		shape.draw();
//		Circle circle = new Circle();
//		circle.draw();
//		Line line = new Line();
//		line.draw();
//		Rectangle rec = new Rectangle();
//		rec.draw();
	}

}
