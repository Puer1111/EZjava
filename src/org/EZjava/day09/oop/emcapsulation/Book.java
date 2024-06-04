package org.EZjava.day09.oop.emcapsulation;

public class Book {
	
	public static void main(String[] args) {
		//필드에 직접 접근(옳지 않음)
		//		Book book = new Book();
//		book.title = "춘향뎐";// is not visible
//		book.author="작자미상";
		
		//필드에 직접 접근하지 않고 객체 초기화 하는 방법
		//생성자를 통해서 초기화
		Book book = new Book("츈향뎐","작자미상");
	// setter()메소드를 이용한 초기화 - > 생성자 통한 초기화로 압축가능
		Book bookbook = new Book();
		bookbook.setTitle("춘향뎐");
		bookbook.setAuthor("작자미상");
	}
	private	String title;
	private String author;
	
	public Book() {	
		this("","");
		
		
	}
	public Book(String title, String author) {
		this.title= title;
		this.author = author;
	}
//	setter , getter 사용이유: 필드에 직접 접근하지 못하게 하고 우회해서 접근하게하려고.
// 1.set을 쓰고 필드명을 낙타표기법으로 작성
// ex) 필드가 name 이면 Setter()메소드는 setName()
//	2. get을 쓰고 필드명을 낙타 표기법으로 작성
//	ex)필드가age이면 getAge()가 된다
	//Setter () 메소드
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// getter()메소드
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	//	String bookTitle;
//	String publishingdate;
//	String bookauthor;
//	int bookprice;
//	String category;
//	String publisher;
//	//멤버 변수
//	
//	public void borrow() {}
//	public void sell() {}
//	public void register() {}
//	//멤버 메소드


}
