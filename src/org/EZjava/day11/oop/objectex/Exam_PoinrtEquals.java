package org.EZjava.day11.oop.objectex;

public class Exam_PoinrtEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point = new Point(2,3);
		Point point1 = new Point(2,3);
		
		if(point.equals(point1)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
	}

}
