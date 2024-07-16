package tutorial;

import java.io.File; // important import for files

public class tutnum7 {
	public static void main(String[] args) {

		// file class
		File file = new File("C:\\Users\\George\\Desktop\\blablablah.txt"); // you need to get file path
		// you could do / or \\
		// if file in your folder then all u could do is 'blablah.pdf'
		if (file.exists()) {
			System.out.println("that file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			
		}
		else {
			System.out.println("doesnt exist");
		}
		
		
	}

}
