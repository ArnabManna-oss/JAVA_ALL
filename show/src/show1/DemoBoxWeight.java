package show1;

public class DemoBoxWeight {

	public static void main(String[] args) {
		BoxWeight ob= new BoxWeight(10,20,15,34.5);
		
		BoxWeight ob1=new BoxWeight(2, 3, 4, 0.076);
		double vol;
		
		vol=ob.volume();
		System.out.println("vol of box 1 ="+vol);
		System.out.println("weigth is ="+ob.weight);
		System.out.println();
		

		vol=ob1.volume();
		System.out.println("vol of box 2 ="+vol);
		System.out.println("weigth is ="+ob1.weight);
	}

}
