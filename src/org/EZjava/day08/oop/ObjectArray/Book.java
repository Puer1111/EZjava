package org.EZjava.day08.oop.ObjectArray;

public class Book {
	public String title;
	public String Author;
	
	public Book() {}
	
public Book(String title,String Author) {
	this.title = title;
	this.Author = Author;
}

public String toString() {
	return"("+this.title+","+this.Author+")";
}
}
