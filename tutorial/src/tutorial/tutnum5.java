package tutorial;

public class tutnum5 {
	public static void main(String[] args) {
		car myCar = new car();
		
		car mySecondCar = new car();
		
		System.out.println(myCar.model);
		System.out.println(myCar.make);
		
		myCar.drive();
		
		myCar.brake();

		System.out.println(mySecondCar.model); // OOP programming
		System.out.println(mySecondCar.make); // diff file
			}

}

