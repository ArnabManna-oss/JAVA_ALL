package OOP;

import java.util.Scanner;

public class Employee {
	public int id;
	public String Name;
	public double Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
//	public Employee(int id, String name, double salary) {
//		super();
//		this.id = id;
//		Name = name;
//		Salary = salary;
//	}
//	
	
	
	
//	void input() {
//		Scanner in=new Scanner(System.in);
//		System.out.println("enter ID");
//		this.id=in.nextInt();
//		System.out.println("enter the Name");
//		in.nextLine();
//		this.Name=in.nextLine();
//		System.out.println("enter salary");
//		this.Salary=in.nextDouble();
//	}
//	void display() {
//		System.out.println(id+"\t\t"+Name+"\t\t"+Salary);
//	}
}
