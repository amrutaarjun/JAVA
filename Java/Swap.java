import java.util.Scanner;

public class Swap {
	public static void swap()
	{
       int no1,no2;
       int temp;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no1");
       no1=sc.nextInt();
       System.out.println("Enter no2");
       no2=sc.nextInt();
       System.out.println("Before swapping two numbers are:"+no1 +" "+ +no2);
       temp=no1;
       no1=no2;
       no2=temp;
       System.out.println("After swapping two numbers are:"+no1 +" "+ +no2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap();

	}

}
