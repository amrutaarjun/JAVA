import java.util.Scanner;

public class Prime_no_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,m=0,flag=0;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	
	m=n/2;
	for(i=2;i<=m;i++)
	{
		if(n%i==0)
		{
		   System.out.println("Number is not a prime");
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		 System.out.println("Number is a prime");
	}
		

	}

}
