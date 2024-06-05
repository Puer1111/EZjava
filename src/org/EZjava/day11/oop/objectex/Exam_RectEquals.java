package org.EZjava.day11.oop.objectex;

class Rectangle {
	int width;
	int height;
	public Rectangle() {}
	public Rectangle(int width , int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Rectangle rect = (Rectangle)obj; // 다운캐스팅
		if(width * height == rect.width*rect.height) {
			return true;
		}
		else {
			return false;
		}
//		return super.equals(obj);
	}
}


public class Exam_RectEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1=new Rectangle(5,7);
		Rectangle rect2 = new Rectangle(5,7);
//		rect1 과 2의 주소는 다름.
		if(rect1.equals(rect2)) {
			System.out.println("같습니다");
		}
		else {
			System.out.println("다릅니다");
		}
		
		
	}

}
