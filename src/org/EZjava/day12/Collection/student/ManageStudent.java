package org.EZjava.day12.Collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.EZjava.day11.oop.member.Member;

public class ManageStudent implements ManageInterface {

	private List<Student> sList;

	public ManageStudent() {
		sList = new ArrayList<Student>();
	}

	@Override
	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
		sList.add(student);
	}

	@Override
	public List<Student> searchListByName(String name) {
		// TODO Auto-generated method stub
		if (name != null) {
			List<Student> SearchList = new ArrayList<Student>();
			for (Student std : sList) {
				if (name.equals(std.getName())) {
					System.out.println(std.getName());
					SearchList.add(std);
				}
			}
			return SearchList;
		}
		return null;
	}

	public Student searchOneByName(String name) {
		// TODO Auto-generated method stub
		if (name != null) {
			for (Student std : sList) {
				if (name.equals(std.getName())) {
					return std;
				}
			}
		}
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student);

	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);

	}



	public Map<String, Object> searchModifyStudent(String name) {
		if (name != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for (int i = 0; i < sList.size(); i++) {
				Student student = sList.get(i);
				// for (Student student : sList) {
				if (name.equals(student.getName())) {
					result.put("Student", student);
					result.put("index", i);
					return result;
				}
			}
		}
		// }

		return null;
	}

	public int IndexByName(String name) {
		if (name != null) {
			int count = 0;
			for (Student student : sList) {
				if (name.equals(student.getName())) {
					return count;
				}
				count++;
			}

		}
		return 0;
	}

}
