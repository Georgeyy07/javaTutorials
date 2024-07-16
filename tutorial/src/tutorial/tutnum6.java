package tutorial;

public class tutnum6 {

	
	// constructor = special method that is called when an object is instantiated

	public static void main(String[] args) {
		
		Human human = new Human("Rick", 18, 150.5);
		Human human2 = new Human("morty", 14, 120.5);

		
		System.out.println(human.name);
		System.out.println(human2.name);
		
		human2.eat();
		human.drink(); // with Human.java
	}
}
