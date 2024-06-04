package org.EZjava.day10.oop.member;


public class MemberRun {
	public static void main(String[] args) {
		// 회원관리 프로그램
		/*
		 * 1.회원가입 2.회원정보검색
		 */
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		end: 
			while (true) {
			int menu = view.printMenu();
			switch (menu) {
			case 1:
				Member member = view.inputMember();
				mng.registerMember(member);
				break;
			case 2:
				String memberId = view.inputMemberId();
				member = mng.searchOneById(memberId);
				view.displayMember(member);
				break;
			case 3:
				Member[] members = mng.allMember();
				view.displayMemberList(members);
			case 4:
				view.printMessage("종료되었습니다");
				break end;

			default:
				view.printMessage("잘못 입력하셨습니다.");
			}
		}
	}
}
