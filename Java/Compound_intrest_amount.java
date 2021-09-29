import java.util.Scanner;

public class Compound_intrest_amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,n;
		double p,r,comp_amount,comp_interest;
     System.out.println("Enter your data:");
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the Principal=");
     p= sc.nextDouble();
     System.out.println("Enter the Interest Rate=");
     r=sc.nextDouble();
     System.out.println("Enter the Time that money is borrowed =");
     t=sc.nextInt();
     System.out.println("Enter the value of n =");
     n=sc.nextInt();
     
    comp_amount= p * (Math.pow((1+r/n),n*t));
    comp_interest=comp_amount-p;
    System.out.println("The Compund Interest is ="+comp_interest);
    System.out.println("The Compound Amount is ="+comp_amount);
    
     
     
     
     


	}

}
