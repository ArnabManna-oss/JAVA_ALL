package SwingWa;

import java.awt.*;
import javax.swing.*;

public class AddGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition uhh= new Addition();
	}
}

class Addition extends JFrame
{
	public Addition(){
		
		JTextField f1= new JTextField(5);
		JTextField f2= new JTextField(5);
		JButton b1= new JButton("click me");
		JLabel l1= new JLabel("result");
		
		add(f1);
		add(f2);
		add(b1);
		add(l1);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}