package FRAMES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("First page");
		frame.setVisible(true);
		frame.setSize(500,500);
		
		frame.setLayout(null);
		
		JButton btn=new JButton("Admin");
		btn.setBounds(80, 150, 300, 40);
		frame.add(btn);
		
		JButton btn1=new JButton("User");
		btn1.setBounds(80, 200, 300, 40);
		frame.add(btn1);
		
		//backend of BTN!
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Page2.main(args);
				frame.dispose();
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Page2_1.main(args);
				frame.dispose();
			}
		});
		
	}

}