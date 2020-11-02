package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.weekb.Student;

public class FileStuff {
	public static final String studentFile = "studentFile.txt";
	
	public static void writeStudentFile(List<Student> sList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(studentFile));
			objectOut.writeObject(sList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@SuppressWarnings("unchecked")
	public static void readStudentFile() {
		try {
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(studentFile));
			Roster.studentList=(ArrayList<Student>)objectIn.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
