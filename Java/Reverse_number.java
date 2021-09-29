import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n, y,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=sc.nextInt();
		while(n>0)
		{
		y=n%10;
		rev=(rev*10)+y;
	    n=n/10;
		}
		System.out.println("The reverse number is:"+rev);
	}

}
