package org.EZjava.day11.oop.interfacepkg;

public class Bear implements FoodInterface{

	public String animalFood() {
		System.out.println("feed honey");
		return "honey";
	}
}
