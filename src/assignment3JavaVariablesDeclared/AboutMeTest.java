package assignment3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {

		// Constructor is initialized by default.
		AboutMe mySelf = new AboutMe();

		mySelf.myName = "Muktadir Hussen";
		mySelf.myGender = 'M';
		mySelf.myAge = 35;
		mySelf.myGrade = 4.55;
		mySelf.myHeight = 5.67f;
		mySelf.myHouseNumber = 3447;
		mySelf.myPhoneNumber = 9294039009l;
		mySelf.myAnnualIncome = 14500000;
		mySelf.fullTimeJob = true;

		// Method is initialized here.
		mySelf.aboutMe();

		AboutMe alex = new AboutMe();
		
		alex.myName = "Alex";
		alex.myGender = 'M';
		alex.myAge = 38;
		alex.myGrade = 4.50;
		alex.myHeight = 6.67f;
		alex.myHouseNumber = 5447;
		alex.myPhoneNumber = 8284039009l;
		alex.myAnnualIncome = 24500000;
		alex.fullTimeJob = false;
		alex.aboutMe();
	}

}
