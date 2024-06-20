package org.EZjava.day16.Test;

public class UserInfo {
public void main() {
	User[] user = new User[3];
	user[0] = new User("홍길동", 30 , "서울");
user[1] = new User("홍길동", 30 , "서울");
	user[2] = new User("홍길동", 30 , "서울");

	User[] userArr = new User[3];
	for(int i = 0; i<userArr.length; i++) {
		userArr[i] = user[i];
	}
	
	for(int i =0; i < userArr.length; i++) {
		System.out.println("========");
		System.out.println(userArr[i].toString());
		System.out.println("========");
}

}
}
