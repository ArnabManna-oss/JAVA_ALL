package SolarSystem;

public class Planet {
	String name;
	int DFS;
	
	public Planet(String name, int DFS) {
		this.name = name;
		this.DFS = DFS;
	}
	

	int distance(Planet p)
	{
		return Math.abs(DFS-p.DFS);
	}

}
