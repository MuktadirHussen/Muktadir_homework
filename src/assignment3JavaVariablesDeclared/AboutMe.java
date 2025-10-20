package assignment3JavaVariablesDeclared;

public class AboutMe {

	// Variable is declared here.
	String myName;
	char myGender;
	byte myAge;
	float myHeight;
	double myGrade;
	long myPhoneNumber;
	short myHouseNumber;
	int myAnnualIncome;
	boolean fullTimeJob;

	// Constructor is declared here.
	public AboutMe() {

		System.out
				.println("\t*****************This Is About Myself And My Best Friend**************************" + "\n");

	}

	// Method is implemented here.
	public void aboutMe() {

		System.out.println("MyName: " + myName + "\nGender: " + myGender + "\nAge: " + myAge + "\nHeight: " + myHeight
				+ "\nGrade: " + myGrade + "\nPhoneNumber: " + myPhoneNumber + "\nHouseNumber: " + myHouseNumber
				+ "\nAnnualIncome: " + myAnnualIncome + "\nFullTimeJob: " + fullTimeJob + "\n");

	}

}