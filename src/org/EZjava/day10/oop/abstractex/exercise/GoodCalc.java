package org.EZjava.day10.oop.abstractex.exercise;

import java.util.Scanner;

class GoodCalc extends Calculator{
Scanner sc = new Scanner(System.in);
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
	return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i =0; i<a.length; i++) {
			//a1[i] = sc.nextInt(); 
			sum+=a[i];
		}
		return sum/a.length;
	}
	 
}
