package org.EZjava.day07.oop.Exercise;

public class Suit {
	public static void main(String[] args) {
		Suit s = new Suit(100);
	}
	
	int size;
	String brand;
	int price;
	
	public Suit (int size) {
		this(size , "Hazzys"); // 19호출
		//22번 출력 후 15 출 
		System.out.println("Suit(int)호출");
		
	}

	public Suit(int size, String brand){ 
		this(size,brand,100000);  //24 호출
		//28 출력 후 19번 출력
		System.out.println("Suit(int,String)호출");
	}
	public Suit (int size, String brand, int price) {
		this.size = size;
		this.brand= brand;
		this.price=price;
		System.out.println("Suit(int,String,int) 호출");
	}
	
}
