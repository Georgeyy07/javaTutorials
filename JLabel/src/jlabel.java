import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class jlabel {
	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("example.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		
		JLabel label = new JLabel(); // creates label
		label.setText("we we we we w ew w e"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP); 
		label.setForeground(new Color(90, 120, 200));
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JFrame frame = new JFrame(); // creates frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500); // x and y dimension
		frame.setVisible(true); // make frame visible
		frame.add(label);
		JButton button = new JButton();
		button.getBorder();
		button.setVisible(true);
		
	}

}
