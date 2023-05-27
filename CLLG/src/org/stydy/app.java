package org.stydy;

import org.stydy.cars.corola;
import org.stydy.cars.swift;
import org.stydy.interfaces.car;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1= new swift();
		car c2= new corola();
		System.out.println(c1.getCar());
		System.out.println(c2.getCar());
	}

}
