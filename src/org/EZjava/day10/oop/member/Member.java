package org.EZjava.day10.oop.member;

public class Member {
	private String MemberId;
	private String MemberAddress;
	private String Memberpw;
	private int MemberAge;
	private String MemberEmail;
	private String MemberPhone;
	private String Membername;

public Member() {}
//Setter
//Getter
//public String GetMemberId() {
//	return this.MemberId;
//}
public String getMemberId() {
	return MemberId;
}
public void setMemberId(String MemberId) {
	this.MemberId = MemberId;
}
public String getMemberAddress() {
	return MemberAddress;
}
public void setMemberAddress(String MemberAddress) {
	this.MemberAddress = MemberAddress;
}
public String getMemberpw() {
	return Memberpw;
}
public void setMemberpw(String Memberpw) {
	this.Memberpw = Memberpw;
}
public int getMemberAge() {
	return MemberAge;
}
public void setMemberAge(int MemberAge) {
	this.MemberAge = MemberAge;
}
public String getMemberEmail() {
	return MemberEmail;
}
public void setMemberEmail(String MemberEmail) {
	this.MemberEmail = MemberEmail;
}
public String getMemberPhone() {
	return MemberPhone;
}
public void setMemberPhone(String MemberPhone) {
	this.MemberPhone = MemberPhone;
}
public void setMembername(String Membername) {
	this.Membername=Membername;
}
public String getMembername() {
	return Membername;
}
}