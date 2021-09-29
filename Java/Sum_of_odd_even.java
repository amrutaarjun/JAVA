import java.util.Scanner;

public class Sum_of_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,even_sum=0,odd_sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			   even_sum=even_sum+i;	
			}
			else
			{
				odd_sum=odd_sum+i;
			}
		}
		System.out.println("sum of all even number is:"+even_sum);
		System.out.println("sum of all odd number is:"+odd_sum);
        sc.close();
	}

}
