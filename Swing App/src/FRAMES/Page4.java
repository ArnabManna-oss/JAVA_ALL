package FRAMES;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Page4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Register User");
		frame.setVisible(true);
		frame.setSize(500,700);
		frame.setLayout(null);
		
		JLabel l1=new JLabel("Register User");
		l1.setBounds(200, 5, 300, 100);
		frame.add(l1);
		
		JLabel l2=new JLabel("Name :");
		l2.setBounds(10, 50, 300, 100);
		frame.add(l2);

		JLabel l3=new JLabel("Email:");
		l3.setBounds(10, 150, 300, 100);
		frame.add(l3);
		
		JLabel l4=new JLabel("Phone:");
		l4.setBounds(10, 260, 300, 100);
		frame.add(l4);
		
		JLabel l5=new JLabel("Pass:");
		l5.setBounds(10, 350, 300, 100);
		frame.add(l5);
		
		JTextField t1=new JTextField();
		t1.setBounds(70, 70, 300, 50);
		frame.add(t1);
		
		JTextField t2=new JTextField();
		t2.setBounds(70, 170, 300, 50);
		frame.add(t2);
		
		JTextField t3=new JTextField();
		t3.setBounds(70, 270, 300, 50);
		frame.add(t3);
		
		JTextField t4=new JTextField();
		t4.setBounds(70, 370, 300, 50);
		frame.add(t4);
		
		JButton b1= new JButton("Save");
		b1.setBounds(200, 500, 100, 70);
		frame.add(b1);
	}

}