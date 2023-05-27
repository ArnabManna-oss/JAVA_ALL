package client;

import Factory__design.PolygonFactory;
import Interface_Gen.Polygon;

public class client {

	public static void main(String[] args) {
		Polygon polygon=PolygonFactory.getInstance(3);
		System.out.println(polygon.getName());

	}

}
