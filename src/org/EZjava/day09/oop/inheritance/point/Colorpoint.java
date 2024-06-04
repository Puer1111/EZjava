package org.EZjava.day09.oop.inheritance.point;

public class Colorpoint extends Point {

	// TODO Auto-generated method stub
	private String color;

	public Colorpoint() { 
		super();//this()처럼 생성자 호출하는데 부모의 생성자 호출함
//				상속 시 부모 생성자 부터 호출.
	}
	
	public Colorpoint(int x, int y ,String color) {
		super(x,y); // 부모 생성자 초기화.
//		this.x=x;
//		this.y=y;
		this.color = color;
	}
	public void ShowColorpoint() {
		super.showPoint();
		System.out.println(this.color +"색의 점입니다.");
	}
}
