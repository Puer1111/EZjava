package org.EZjava.day08.oop.ObjectArray.student;

public class ManageStudent {
	Student students[] = new Student[3];

	public void inputInfo(Student[] students) {
		this.students = students;
	}

	public Student[] printInfo() {
		return students;
	}
}
