package org.EZjava.day16.Test;

public class UserInfo {
public void main() {
	User[] userArr = new User[3];
	userArr[0] = new User("홍길동", 30 , "서울");
	userArr[1] = new User("홍길동", 30 , "서울");
	userArr[2] = new User("홍길동", 30 , "서울");

	for(int i =0; i < userArr.length; i++) {
		System.out.println("========");
		System.out.println(userArr[i].toString());
		System.out.println("========");
	}
}
}
