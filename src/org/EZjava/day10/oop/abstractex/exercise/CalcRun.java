package org.EZjava.day10.oop.abstractex.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	GoodCalc c = new GoodCalc();	
	System.out.println("합: " + c.add(5,7));		//5,7
	System.out.println("차: " + c.subtract(10, 23));		//10,23
	System.out.println("평균: "+ c.average(new int [] {5,7,10,23}));		// 57,1023
		
	}

}
