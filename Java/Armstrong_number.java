import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n ,r,temp=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("The entered no is armstrong number.");
		}
		else
		{
			System.out.println("The entered no is not a armstrong number.");
		}

	}

}
