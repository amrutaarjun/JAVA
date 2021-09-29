import java.util.Scanner;

public class array_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,6};
		 
		 boolean flag =true;
		 
		 for(int i=0;i<arr.length;i++) 
		 {   
			 System.out.println("Enter number: ");
			 int n=sc.nextInt();
		     if(n==arr[i])
		     {
		    	System.out.println("Index of "+ n +" : "+i); 
		    	flag=false;
		     } 
	     }
		 if(flag=false)
			 System.out.println("Number is not present in array.");
	}
}
