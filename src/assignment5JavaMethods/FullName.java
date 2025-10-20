package assignment5JavaMethods;

public class FullName {

	public String fullName(String fName, String lName) {

		String fullName = fName + lName;

		System.out.println("Family Member: " + fName + " " + lName);

		return fullName;

	}

	public static void main(String[] args) {
		FullName member = new FullName();

		member.fullName("Ahyan", "Hussen");
	}

}
