package SolarSystem;

public class Solar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet p1= new Planet("Earth", 100);
		Planet p2= new Planet("Mars", 200);
		Planet p3= new Planet("Venus", 100000);
		
		
		System.out.println("distance form "+p1.name+" to "+p3.name+" is "+p1.distance(p3));

	}
}
