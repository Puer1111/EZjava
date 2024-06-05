package org.EZjava.day11.oop.member;

import javax.swing.text.View;

public class MemberRun {

	public static void main(String[] args) {
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		end:
		while (true) {
			int choice = view.mainmenu();
			switch (choice) {
			case 1:
				Member member = view.inputMember();
				mng.insertMember(member);
				break;
			case 2:
				String email = view.inputEmail("검색");
				member = mng.SearchOneByEmail(email);
				if(member != null)
				view.printOneMember(member);
				else
					view.displayMsg("검색 결과가 없다");
				break;
			case 3:
				Member[] members = mng.getAllMembers();
				view.printAllMembers(members);
				break;
			case 4:
				email = view.inputEmail("수정");
				member = mng.SearchOneByEmail(email);
				if(member != null) {
					view.modifyMember(member);
				}
				break;
			case 5:
				mng.deleteAllMembers();
				break;
			case 0:
				view.displayMsg("프로그램 종료");
				break end;
			default:
				view.displayMsg("잘못 입력하였다");
				break;

			}
		}
	}

}
