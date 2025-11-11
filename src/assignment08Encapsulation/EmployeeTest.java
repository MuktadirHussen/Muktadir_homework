package assignment08Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();

		System.out.println("***********Employee Info***************");
		System.out.println();

		employee.setName("Muktadir Hussen");
		employee.setSex('M');
		employee.setAge(35);
		employee.setCitizen(true);

		System.out.println("Employee Name: " + employee.getName() + "\nGender: " + employee.getSex() + "\nAge: "
				+ employee.getAge() + "\nIsCitizen: " + employee.isCitizen());
	}

}
