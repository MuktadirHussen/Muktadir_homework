package assignment7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();

		animal.animalInfo();

		System.out.println("*********************");

		// Hierarchical inheritance
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("*********************");

		// Multi-Level Inheritance
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("*********************");
		// Multi-Level Inheritance
		Cobra cobra = new Cobra();
		cobra.cobralInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("*********************");

		Birds birds = new Birds();
		birds.birdslInfo();
		birds.animalInfo();

		System.out.println("*********************");
		// Hierarchical inheritance
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdslInfo();
		robin.animalInfo();

		System.out.println("*********************");
		// Hierarchical inheritance
		Mammal mammal = new Mammal();
		mammal.mammallInfo();
		mammal.animalInfo();

		System.out.println("*********************");
		// Single Inheritance
		Dog dog = new Dog();
		dog.doglInfo();
		dog.mammallInfo();

		System.out.println("*********************");
		// Multi-Level Inheritance
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.doglInfo();
		bullDog.mammallInfo();
		bullDog.animalInfo();

	}

}
