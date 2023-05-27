
public class employee {

	 String name,id,salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public employee() {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String toString()
	{
		return "employee [id="+id+" ,name="+name+" ,salary="+salary+"]";
	}
}

	