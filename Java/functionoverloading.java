import java.util.Scanner;

public class functionoverloading {
	
		public static void addition()
		{
		System.out.println("adding");
		System.out.println("-----------------");
		}
		public static void addition(int i,int j)
		{
			System.out.println("Add="+(i+j));
			System.out.println("-----------------");
		}
		public static void addition(int i,int j,int k)
		{
			System.out.println("Add="+(i+j+k));
			System.out.println("-----------------");
		}
		public static void addition(double i,int j)
		{
			System.out.println("Add="+(i+j));
			System.out.println("-----------------");
		}
		public static void addition(String i,String j)
		{
			System.out.println("Add="+(i+" "+j));
			System.out.println("-----------------");
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		double p;
		int add;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1");
        a=sc.nextInt();
        System.out.println("Enter no2");
        b=sc.nextInt();
        System.out.println("Enter no3");
        p=sc.nextDouble();
       addition();
       addition(a,b);
       addition(a,b,a);
       addition(p,b);
       addition("Hello"," Amruta");
       
		

	}

}
