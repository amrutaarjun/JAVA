/*Create Employee class with empid,name,address,salary.Use Getter Setters
2.2 :create array of 5 employees...show all employees using for loop as well as for each loop...in same assignment
2.3:create array of 5 employees ...show those employee who are getting salary >20000.*/

public class Employee {
	private int empid;
	private String name;
	private String address;
	private double salary;
	public Employee(int i,String n,String a,double s)
	{
		empid=i;
		name=n;
		address=a;
		salary=s;
	}
	
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public int getEmpid()
	{
		return empid;
	}
	

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("empid: "+empid +"   Name: "+name +"       Address: "+address +"    Salary:"+salary);
	}

	
}
