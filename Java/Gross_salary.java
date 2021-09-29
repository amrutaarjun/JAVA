import java.util.Scanner;

/*Write a  program to input basic salary of an employee and calculate its Gross salary according to 
following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%*/

public class Gross_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hra = 0;
		double da=0;
		double gross_salary,bs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary:");
		bs=sc.nextDouble();
		if(bs<=10000)
		{
			hra=(bs*20)/100;
			da=(bs*80)/100;
		}
		else if(bs<=20000)
		{
			hra=(bs*25)/100;
			da=(bs*90)/100;
		}
		else if(bs>20000)
		{
			hra=(bs*30)/100;
			da=(bs*95)/100;
		}
		gross_salary=bs+hra+da;
		System.out.println("The gross salary is:"+gross_salary);

	}

}
