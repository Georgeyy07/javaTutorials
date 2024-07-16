package tutorial;

public class tutnum4 { // print f method

	public static void main(String[] args) {
		// two arguments = format string + (object/variable/value)
		// % [flags] [precision](how much digits you want) [width](how much letters you want give) [conversion](if you want it to be + or -)
		
		// can add % anywhere
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "hellomoto";
		int myInt = 50;
		double myDouble = 1000;
		
		System.out.printf("%b", myBoolean);
		System.out.printf("%s", myString);
		System.out.printf("%c", myChar);
		System.out.printf("I dont know what im doing %d", 123); // d for integers
		System.out.printf("%f", myDouble); // f for double or float

		// this is seperate 
		// final keyword
		
		final double pi = 3.13159;
		 // pi = 4; // wrong as final declares that you cannot change a variable
		System.out.println(pi); // this will give an error
		
	}
}
