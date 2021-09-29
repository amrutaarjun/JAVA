
public class Constructor_details {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	public Constructor_details()
	{   
		System.out.println("Default");
	    String name="Riya";
	    String email="riya@gmai.com";
	    int age=25;
	    double creditlimit=10000;
	}
	
	public Constructor_details(String nm,String email, int age, double creditLimit)
	{    
		
		this.name=nm;
		this.email=email;
		this.age=age;
		this.creditLimit=creditLimit;
	}
	
	public void display() 
	{
		System.out.println("Customer name is: "+name);
		System.out.println("Customer email is: "+email);
		System.out.println("Customer age is: "+age);
		System.out.println("Customer creditlimit is: "+creditLimit);
	}
    
	public void getDetails() 
	{
		System.out.println("Customer name is: "+name +"     creditLimit is :"+creditLimit);
		System.out.println("---------------------------------------------");
		//System.out.println("Now The Credit Limit is :   "+creditLimit);
	}
	public void setCreditLimit(double limit)
	{
		creditLimit=limit;
	}
	public double getCreditLimit()
	{
		return creditLimit;
	}
}
