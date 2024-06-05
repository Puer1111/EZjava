package org.EZjava.day11.oop.objectex;

public class Point {
int x ;
int y; 

public Point() {}
public Point(int x , int y) {
	this.x = x;
	this.y=y;



}
public boolean equals (Object obj) {
	Point point = (Point)obj;
	if(x== point.x && y== point.y) {
		return true;
	}
	else {
		return false;
	}
}


}
