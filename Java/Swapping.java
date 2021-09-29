import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Before Swapping the value of a and b:"+a+" "+b);
		 t=a;
		 a=b;
		 b=t;
		 System.out.println("After Swapping the value of a and b:"+a+" "+b);

	}

}
