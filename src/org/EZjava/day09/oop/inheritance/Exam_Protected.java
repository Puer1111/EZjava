package org.EZjava.day09.oop.inheritance;

import org.EZjava.day09.oop.inheritance.point.Point;

class Super{
	public int pub;
	int def;
	protected int pro;
	private int pri;
}
class sub extends Super{
	void set() {
		Super sup = new Super();
		super.pub=24;
		super.def = 5;
		super.pro = 7;
//		super.pri = 1023; // is not invisible
	}
}

class ShapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub = 24; // public 이라 가능
//		p.def = 57; // default 는 같은 패키지에서만 가능
//		p.pro = 10; // protected 는 같은 패키지 or 상속일때 가능
//		p.pri= 23;// 당연히 안됨 private

		super.pro = 23; // 상속받아서 가능
		super.pub =2024;
//		super.def = 33;  안됨
//		super.pri =22; 안됨
	}
}

public class Exam_Protected {

}
