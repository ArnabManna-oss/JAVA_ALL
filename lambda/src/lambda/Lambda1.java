package lambda;

public class Lambda1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Answerable phone = () -> { return "hello"; };
		System.out.println(phone.answer());
		
		Predicate isodd= n -> n%2!=0;
		System.out.println(isodd.test(2));
	}

}
