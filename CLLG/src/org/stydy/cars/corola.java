package org.stydy.cars;



import org.stydy.interfaces.car;

public class corola implements car {

	
	public String getCar() {
		Engine ob=new Engine();
		String st= "corola with engine ="+ob.geteng1();
		return st;
	}

}
