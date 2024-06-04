package org.EZjava.day09.oop.Overloading;
class Weapon{
	String name;
	int price;

	public Weapon() {} //매개변수 없음
	public Weapon(String name, int price) {
		this.name= name;
		this.price = price;
	}
}



public class Exam_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*메소드오버로딩 :같은 이름 생성자 두개 써도 하나는 매개변수 있고
		 * // 하나는 없으면 or 타입 이 다르면 오류 x
		 * 오버로딩 예시
		 * ex) System.out.println("")
		 괄호 안에 타입 다르게 작성가능*/
	}
	public void makesomenoise() {
		
	}
	public void makesomenoise(int num) {
		
	}
}
