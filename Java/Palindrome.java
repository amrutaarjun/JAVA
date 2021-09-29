import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, t,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=sc.nextInt();
		t=n;
		
		while(n>0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	    }

	 if(t == rev)
	 {
		 System.out.println("Number is a palindrome.");
	 }
	 else 
	 {
		 System.out.println("Number is not palindrome.");
	 }

	}

}
