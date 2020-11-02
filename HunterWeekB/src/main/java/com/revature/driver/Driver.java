package com.revature.driver;

import com.revature.menu.MainMenu;
import com.revature.util.FileStuff;
import com.revature.util.Roster;
import com.revature.weekb.Student;

public class Driver {
	static {FileStuff.readStudentFile();}
	public static void main(String[] args) {
		MainMenu.mainMenu();
	}
}
