package SwingWa;

import java.awt.FlowLayout;
import javax.swing.*;

public class FristGUI {
	public static void main(String[] args) {
		Abc ob=new Abc();
	}
}

class Abc extends JFrame// it works like card 
{
	Abc(){
		
		setLayout(new FlowLayout());//FlowLayout , Grid , Null
		
		JLabel l= new JLabel("High fi");
		add(l);
		
		JLabel l1= new JLabel("wif fe");
		add(l1);
		
		setVisible(true);
		setSize(600,400);//(width , height)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
