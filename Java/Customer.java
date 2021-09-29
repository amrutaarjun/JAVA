import java.util.Scanner;

public class Customer
{
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	Scanner sc=new Scanner(System.in);
	void acceptInfo()
	{
	   	System.out.println("Enter the customer name:");
	   	name=sc.next();
	   	System.out.println("Enter the customer  email:");
	   	email=sc.next();
	   	System.out.println("Enter customer Age:");
	   	age=sc.nextInt();
	  	System.out.println("Enter customer creditLimit");
	   	creditLimit=sc.nextDouble();
	}
	public void setCreditLimit(double limit) 
	{
		this.creditLimit=limit;
	}
	public double getCreditLimit()
	{
		return this.creditLimit;
		
	}
	void showDetails()
	{
		System.out.println("Name of customer is:"+name);
		System.out.println("The credit limits of customer is:"+creditLimit);
	}
	
	
	

}
