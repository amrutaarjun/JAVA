import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		int a, b,add1;
		char ch1,ch2,add2;
		System.out.println("Enter your data for addition");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		
		add1=a+b;
		System.out.println("Addition of a and b ="+add1);
		
		System.out.println("Enter the value of ch1:");
		ch1=sc.next().charAt(0);
		
		System.out.println("Enter the value of ch2:");
		ch2=sc.next().charAt(0);
		
		System.out.println("Addition of ch1 and ch2 ="+ch1+ch2);
		sc.close();
		
		
				
				
		
		

	}

}
