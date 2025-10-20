package assignment5JavaMethods;

public class FullName {

	public String fullName(String fName, String lName) {

		System.out.println("Family Member: " + fName + " " + lName);

		return fName + lName;

	}

	public static void main(String[] args) {

		FullName member = new FullName();
		
        //Yes, a parameterized method can be called multiple times with different arguments.
		member.fullName("Muktadir", "Hussen");
		member.fullName("Ahyan", "Hussen");
		member.fullName("Runa", "Jabbar");
	}

}
