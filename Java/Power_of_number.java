import java.util.Scanner;

public class Power_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exponent;
	    float power = 1;
	    int i;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter base: ");
	    base=sc.nextInt();
	    System.out.println("Enter exponent: ");
	    exponent=sc.nextInt();
	    int expo = exponent;
	    while (expo < 0)
	    {
	        {
	            power = power/base;
	            expo++;
	        }
	    }
	 
	    if(exponent >0)
	    {
	        for(i = 1; i <= exponent; i++)
	        {
	            power = power * base;
	        }
	    }
	    System.out.println("The power is:"+power);

	}

}
