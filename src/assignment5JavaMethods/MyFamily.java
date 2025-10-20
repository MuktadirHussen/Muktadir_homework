package assignment5JavaMethods;

public class MyFamily {
// muktadir
	public int child1Age = 10;
	public int child2Age = 15;
	public int child3Age = 13;
	public int child4Age = 14;

	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of my children age is: " + sum);
		return sum;

	}

	public static void main(String[] args) {
		MyFamily myFamily = new MyFamily();
		myFamily.myFamily();

	}

}
