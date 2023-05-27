package OOP;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Employee e[]=new Employee[4];
		int i=0;
		for(i=0;i<4;i++)
		{
			System.out.println("Employee "+i);
			e[i]=new Employee();
			System.out.println("ID:");
			e[i].setId(in.nextInt());
			
			in.nextLine();
			System.out.println("name:");
			e[i].setName(in.nextLine());
			
			System.out.println("Salary:");
			e[i].setSalary(in.nextDouble());
		}
		
		for(Employee a:e)
		{
			System.out.println("employe id :"+a.getId());
			System.out.println("employee name:"+a.getName());
			System.out.println("employee salary:"+a.getSalary());
			System.out.println();
		}
		
		
		
		
//		Employee e1=new Employee();
//		 int id;
//		 String Name;
//		double Salary;
////		
////		e.id=1;
////		e.Name="Arnab";
////		e.Salary=5000;
////		
////		e1.id=2;
////		e1.Name="Indra";
////		e1.Salary=4000;
////		e.input();
////		e1.input();
//		Scanner in=new Scanner(System.in);
//		System.out.println("enter ID");
//		id=in.nextInt();
//		System.out.println("enter the Name");
//		in.nextLine();
//		Name=in.nextLine();
//		System.out.println("enter salary");
//		Salary=in.nextDouble();
//		e.setId(id);
//		e.setName(Name);
//		e.setSalary(Salary);
//		
//System.out.println("EID\t\tEname\t\tSalary");     
//		System.out.println(e.getId()+"\t\t"+e.getName()+"\t\t"+e.getSalary());
////		System.out.println(e1.id+"\t\t"+e1.Name+"\t\t"+e1.Salary);
//		
////		e.display();
////		e1.display();
//		//System.out.println(e);
//		
	}

}
