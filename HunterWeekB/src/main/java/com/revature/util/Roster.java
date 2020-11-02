package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.menu.MainMenu;
import com.revature.weekb.Student;

public class Roster {
	public static List<Student> studentList = new ArrayList<Student>();
	
	public static Student findStudentByName(String inputName) {
		for (int i = 0; i < studentList.size(); i++) {
			String name = studentList.get(i).getFirstName();
			if(inputName.equals(name)) {
				return studentList.get(i);
			}
		}
		
		System.out.println("Name not found! Please try again.");
		//MainMenu.searchDir();
		MainMenu.mainMenu();
		return null;
	}
}
