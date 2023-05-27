package Factory__design;

import Interface_Gen.Polygon;
import class_Collections.*;

public class PolygonFactory {
	
	public static Polygon getInstance(int n) {
		
		Polygon polygon= null;
		switch (n) {
		case 3: 
			polygon=new triangle();
			break;
		case 4:
			polygon=new square();
			break;
		case 5:
			polygon=new pentagon();
			break;
			
			
		default:
			break;
			
			
		}
		return polygon;

	}

}
