package org.EZjava.day10.oop.interfaceex;

public class Exam_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();

	}

}
