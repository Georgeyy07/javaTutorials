package tutorial;

public class Tutnum3 {
	public static void main(String[] args) {
		String name = "Bro";
		int age = 91;
	//	hello(name, age);
		
		int x = 3;
		int y = 5;
		
		int z = add(x, y);
		// or System.out.println(add(x, y))
		
		System.out.println(z);
	}
	/*
	static void hello(String title, int howoldyouare) { // like a function but its a method
		System.out.println("Hello "+title);
		System.out.println("You are "+howoldyouare);
	} 
	*/
	
	static int add(int num1, int num2){ // return class, instead of void you write the return type(int)
		int z = num1+num2;
	
		return z; // or return x + y
		
	}
	
	

}
