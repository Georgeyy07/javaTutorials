package tutorial;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class tutnum8 {
	public static void main (String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red");
			writer.append("helllo moto"); // can do append or write
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
			
		}		 
		
		
	}

}
