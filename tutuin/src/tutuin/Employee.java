package tutuin;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private int ssnNo;
	private int age;
	private double salary;
	static int idCounter = 0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(int ssnNo) {
		this.ssnNo = ssnNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
//	public Employee( String designation,String name, int ssnNo, int age, double salary) {
//		super();
//		this.name = name;
//		this.designation = designation;
//		this.ssnNo = ssnNo;
//		this.age = age;
//		this.salary = salary;
//		getIdCounter();
//	}
	public Employee(String designation2, String name2, int ssnNo2, int age2, double salary2) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name2;
		this.designation = designation2;
		this.ssnNo = ssnNo2;
		this.age = age2;
		this.salary = salary2;

	}
	
	public static int getIdCounter() {
		idCounter++;
		//setId(idCounter);
		//System.out.print(idCounter);
		return idCounter;
	}
	
}
