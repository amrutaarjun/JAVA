import java.util.Scanner;

/*Write a program which will accept student information like rollno,name,5 subject marks.calculate total and percentage.calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C*/

public class Student {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		float total=0;
		double per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll number:");
		int rollno=sc.nextInt();
		System.out.println("Enter Name of Student:");
		String name=sc.next();
		int[] marks=new int[5];
		
		for(i=0;i<5;i++)
		{  
			System.out.println("Enter the Marks of subjects :"+(i+1)+":");
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		
		System.out.println("The Total marks are:"+total);
		
		System.out.println("----------------------------");
		
		per=(total*100)/(5*100);
		System.out.println("The Percentage are:"+per);
		
		System.out.println("----------------------------");
		
		if(per>75)
		{
			System.out.println("The Grade is A");
		}
		else if(per<74 && per>60)
		{
			System.out.println("The Grade is B");
		}
		else if(per<59)
		{
			System.out.println("The Grade is c");
		}
		
		

	}

}
