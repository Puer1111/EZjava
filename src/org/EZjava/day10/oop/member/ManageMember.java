package org.EZjava.day10.oop.member;

public class ManageMember {
//	private Member member ;
	private Member[] members;
	private int index;
	
	public ManageMember() {
		members=new Member[5];
		index = 0;
	}
	
	public void registerMember(Member member) {
//		this.member = member;
		if(index<members.length-1) {
		index++;
	}
	}


	public Member[] allMember() {
		// TODO Auto-generated method stub
		return members;
	}

	public Member searchOneById(String memberId) {
		// TODO Auto-generated method stub
		for(Member member:members) {
			if(memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}
	
}
