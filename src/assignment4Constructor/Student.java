package assignment4Constructor;

public class Student {

	String name;
	int studentId;
	char gender;
	float grade;
	boolean javaProgrammer;

	public Student() {

		System.out.println("\t**********This is all about Student*************\n");
	
	}

	public Student(String name, int studentId, char gender, float grade, boolean javaProgrammer) {

		this.name = name;
		this.studentId = studentId;
		this.gender = gender;
		this.grade = grade;
		this.javaProgrammer = javaProgrammer;

		System.out.println("Name: " + name + ", ID: " + studentId + ", Gender: " + gender + ", Grade: " + grade
				+ ", Programmer: " + javaProgrammer);
	}

}