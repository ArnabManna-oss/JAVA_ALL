package Abstrsction;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Remote r1=new channel_FAU();
		r1.run();
		r1.show();
		
		
		
		Remote r=new channel1();
		r.run();
		r.show();
		
		Remote r2=new channel2();
		r2.run();
		r2.show();
		

	}

}
