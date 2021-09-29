import java.util.Scanner;

public class Test_constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_details c=new Constructor_details();
		c.display();
		System.out.println("-------------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name:");
		String name=sc.next();
		System.out.println("Enter customer email:");
		String email=sc.next();
		System.out.println("Enter customer age:");
		int age=sc.nextInt();
		System.out.println("Enter customer creditlimit:");
		double creditLimit=sc.nextDouble();
		
		
		Constructor_details c1=new Constructor_details(name,email,age,creditLimit);
		System.out.println("-------------------------------------------");
		System.out.println("Enter new creditlimit:");
		double creditLimit1=sc.nextDouble();
        c1.setCreditLimit(creditLimit1);
       // System.out.println("Updated creditLimit : ");
        //c1.getCreditLimit();
        c1.getDetails();
        
        
		

	}

}
