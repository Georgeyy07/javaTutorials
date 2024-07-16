import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class gui {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // creates frame
		frame.setTitle("JFrame title goes here"); // sets title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); 
		frame.setSize(420, 420); // x and y dimension
		frame.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("example.png"); 
		frame.setIconImage(image.getImage()); // change icon of frame
		frame.getContentPane().setBackground(Color.green);
		
		
	}

}
