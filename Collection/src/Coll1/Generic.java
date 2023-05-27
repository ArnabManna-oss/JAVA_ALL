package Coll1;

class Arnab<T>{
	T x;
	void display() {
		System.out.println(x.getClass().getName());
	}
}
public class Generic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arnab ab= new Arnab();
		ab.x="String";
		ab.display();
	}
}
