package assignment2JavaVariablesInitialized;

public class AboutMe {

	// Here variable is declared, i didn't put any value.
	String name;

	// Here variable is initialized, i put value for each variables.
	String myName = "Muktadir";
	char myGender = 'M';
	int myAge = 35;
	float myGrade = 4.8f;
	boolean fullTimeStudent = true;

	// Here constructor is declared
	public AboutMe() {

		System.out.println("------------ This is all about MySelf ------------" + "\n");

	}

	public void aboutMe() {

		System.out.println("My name is: " + myName);
		System.out.println("My gender is: " + myGender);
		System.out.println("My age is: " + myAge);
		System.out.println("My grade is: " + myGrade);
		System.out.println("Fulltime student: " + fullTimeStudent);

	}

	public static void main(String[] args) {

		// Here constructor is initialized
		AboutMe aboutMe = new AboutMe();

		aboutMe.aboutMe();
	}

}