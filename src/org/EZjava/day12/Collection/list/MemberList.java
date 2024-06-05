package org.EZjava.day12.Collection.list;

class Member{

}

public class MemberList {
Member[] members;
int size;


public  MemberList() {
members = new Member[3];
size = 0;
}
public void add(Member member) {
	members[size]= member;
	size ++;
}
public Member get(int index) {
	return members[index];
}
public int size() {
	return size;
}
public void clear() {
	members = new Member[5];
	size =0;
}

}
