package org.EZjava.day12.Collection.student;

import java.util.List;

public interface ManageInterface {
	void registerStudent(Student student);
	
	Student searchOneByName(String name);
	List<Student>selectAllStudents();
	void modifyStudent(int index, Student student);
	void deleteStudent(int index);

	void modifyStudent(int index, String student);

	List<Student> searchListByName(String name);


}
