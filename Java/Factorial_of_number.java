import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{    
		      fact=fact*i;    
		} 
		System.out.println("Factorial of number is:"+fact);
	}

}
