package FRAMES;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Page3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("third page");
		frame.setVisible(true);
		frame.setSize(500,500);
		
		frame.setLayout(null);
		
		JLabel l1=new JLabel("User Dashboard");
		l1.setBounds(200, 5, 300, 100);
		frame.add(l1);
		
	}

}