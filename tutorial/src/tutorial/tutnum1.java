package tutorial;
import java.util.Random;
import java.util.Scanner;

public class tutnum1 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(1,100);
		System.out.println(x);
		
		while (true){
			Scanner guess = new Scanner(System.in);
			System.out.println("Whats your guess?: ");
			int guessnum = guess.nextInt();
			if (x > guessnum) {
				System.out.println("Guess higher");
			}else if (x < guessnum) {
				System.out.println("Guess lower: ");
			} 

			else{
				System.out.println("You guessed right the number was: "+ guessnum);
				break;
				}
			}
		}
		

		
	}


