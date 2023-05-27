package FRAMES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Page3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("third page");
		frame.setVisible(true);
		frame.setSize(500,500);
		
		frame.setLayout(null);
		
		JLabel l1=new JLabel("Admin Dashboard");
		l1.setBounds(200, 5, 300, 100);
		frame.add(l1);
		
		JButton btn=new JButton("Add User");
		btn.setBounds(20, 150, 100, 40);
		frame.add(btn);
		
		JButton btn1=new JButton("View User");
		btn1.setBounds(20, 200, 100, 40);
		frame.add(btn1);
		
		JButton btn2=new JButton("Delete User");
		btn2.setBounds(20, 250, 100, 40);
		frame.add(btn2);
		
		JButton btn3=new JButton("Logout");
		btn3.setBounds(200, 250, 100, 40);
		frame.add(btn3);
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Page4.main(args);
				frame.dispose();
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
		
		
	}

}