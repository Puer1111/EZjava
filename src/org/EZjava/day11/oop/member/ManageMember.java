package org.EZjava.day11.oop.member;

public class ManageMember {

	Member[] members;
	int index;

	public ManageMember() {
		members = new Member[5];
		index = 0;

	}

	public void insertMember(Member member) {
		if (index < members.length) {
			members[index] = member;
			index++;
		}
	}

	public Member[] getAllMembers() {
		return members;
	}

	public Member SearchOneByEmail(String email) {
		for (Member member : members) {
			if (member != null && email.equals(member.getEmail())) {
				return member;
			}
		}
		return null;
	}
/////////////////////////////////////////////////////////////////////////////////////////
	public void deleteAllMembers() {
		// 초기화
		members = new Member[5];
		index = 0;
	}

	public void updateMember(Member member) {
		int i =0;
		for (Member mOrigin : members) {
			if(mOrigin !=null) {
			String email = mOrigin.getEmail();
			if (mOrigin.equals(member.getEmail())) {
				mOrigin.setAddress(member.getAddress());
				mOrigin.setName(member.getName());
				mOrigin.setphone(member.getphone());
//				members[i] = member;
			}
//			i++;
		}
		}
	}
}

//		for(Member member: members) {
//		member = null ;
//		
//	}	
