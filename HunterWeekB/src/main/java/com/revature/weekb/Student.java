package com.revature.weekb;

import java.io.Serializable;

import com.revature.util.FileStuff;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5249980734621051218L;
	private String firstName;
	private String lastName;
	private int studentID;
	private String grade;
	
	public Student() {
		super();
		Roster.studentList.add(this);
		FileStuff.writeStudentFile(Roster.studentList);
	}

	public Student(String firstName, String lastName, int studentID, String grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.grade = grade;
		Roster.studentList.add(this);
		FileStuff.writeStudentFile(Roster.studentList);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentID=" + studentID + ", grade="
				+ grade + "]";
	}
	
	
	

}
