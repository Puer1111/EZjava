package org.EZjava.day12.Collection.student;

import java.util.List;
import java.util.Map;

public class StudentRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewStudent view = new ViewStudent();
		ManageStudent mng = new ManageStudent();
		end: while (true) {
			int choice = view.printMenu();
			switch (choice) {

			case 1:
				Student std = view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2:
				String name = view.InputName("검색");
				if (name!= null) {
				List<Student>sList=	mng.searchListByName(name);
				view.displayStudents(sList);
				} else {
					view.displayMsg("검색 결과가 없다");
				}
				break;
			case 3:
				List<Student> stdList = mng.selectAllStudents();
				if(stdList.isEmpty()) {
					//selectAllStudents 는 이미 null이 아니라 else가 나오지않기에isEmpty 나 Size()>0 으로 체크
				view.displayStudents(stdList);
				}else {
					view.displayMsg("회원정보가 없습니다");
				}
				break;
			case 4:
				name = view.InputName("수정");
//				Student student = mng.searchModifyStudent(name);
//				student = view.modifyStudent(student);
				Map<String,Object>result = mng.searchModifyStudent(name);
				Student student = view.modifyStudent((Student)result.get("student"));
				mng.modifyStudent((int)result.get("index"),student);
//				int index= mng.IndexByName(name);
//				Student student = mng.searchModifyStudent(name);
//				student = view.modifyStudent(student);
//				mng.modifyStudent(index,student);
				break;
			case 5:
				name = view.InputName("삭제");
				int index = mng.IndexByName(name);
				mng.deleteStudent(index);
				break;
			case 6:
				name = view.InputName("재평가 여부 확인");
				student = mng.searchOneByName(name);
				String passresult = checkPass(student);
				view.displayMsg(passresult);
				break;
			case 0:
				view.displayMsg("프로그램 종료");
				break end;
			default:
				view.displayMsg("1~6사이 수 입력");
			}
		}
		}
		public static String checkPass(Student student) {
			int first = student.getFirstScore();
			int second = student.getSecondScore();
			double avg = (first + second) / 2.0;
			if (avg >= 60) {
				if (first < 40) {
					return "1차 시험 재평가";
				} else if (second < 40) {
					return "2차 시험 재평가";
				} else {
					return "모두 통과";
				}
			} else {
				String result = "";
				if (first < 60) {
					  result += "1차 재평가";
				}
				if (second < 60) {
					result += "2차 시험 재평가";
				}
				else {
					result += " 둘다 재평가";
				}
			
				return result;
			}
		
		}
	}

