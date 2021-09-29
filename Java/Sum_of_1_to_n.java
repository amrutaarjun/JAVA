import java.util.Scanner;

public class Sum_of_1_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of 1 to n is:" +sum);

	}

}
