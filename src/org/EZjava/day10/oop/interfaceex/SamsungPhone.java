package org.EZjava.day10.oop.interfaceex;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("===삼성===");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("=====S-Phone call======");
	}
	
}
