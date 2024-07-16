package tutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class tutnum9 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("poem.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.println((char)data);
				data = reader.read();
			}
			
			
// read() returns an int value that contains the byte value
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
