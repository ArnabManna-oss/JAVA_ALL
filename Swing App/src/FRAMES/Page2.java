package FRAMES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.plugins.tiff.TIFFDirectory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Page2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Admin Login");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		JLabel l1=new JLabel("Admin Login");
		l1.setBounds(200, 5, 300, 100);
		frame.add(l1);
		
		JLabel l2=new JLabel("Email :");
		l2.setBounds(10, 50, 300, 100);
		frame.add(l2);
		

		JLabel l3=new JLabel("password :");
		l3.setBounds(10, 150, 300, 100);
		frame.add(l3);
		
		JTextField t1=new JTextField();
		t1.setBounds(70, 70, 300, 50);
		frame.add(t1);
		
		JTextField t2=new JTextField();
		t2.setBounds(70, 170, 300, 50);
		frame.add(t2);
		
		JButton b1= new JButton("login");
		b1.setBounds(200, 300, 100, 70);
		frame.add(b1);
		
		b1.addActionListener((ActionListener) new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String t1Value = t1.getText();
				String t2Value = t2.getText();
				if (t1Value.equals("arnabmanna") && t2Value.equals("1234")) {
				Page3.main(args);
				frame.dispose();
				}
			}

		});
	}

}