import java.util.Scanner;

public class Greatest_of_three_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1 :");
		n1=sc.nextInt();
		System.out.println("Enter the value of n2:");
		n2=sc.nextInt();
		System.out.println("Enter the value of n3:");
		n3=sc.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
			System.out.println(n1+" is the greatest number");
			}
	    }
		else if(n2>n1)
		{
			if(n2>n3)
			{
				System.out.println(n2+"is the greatest number");
			}
			else 
			{
				System.out.println(n3+"is the greatest number");
			}
		}
		

	}

}
