import java.util.Scanner;

//Write a Java program to find the maximum and minimum value of an array.
public class Min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num,min,max,choice;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array:");
	     num=sc.nextInt();
	     int[] arr=new int[num];
	     System.out.println("Enter the  array elements: ");
	     for (i = 0; i < num; i++)
	     {
	         arr[i]=sc.nextInt();
	     }
	     System.out.println("Entered array elements are: ");
	      for (i = 0; i < num; i++)
	      {
	           System.out.println(+arr[i]);
	      }
          min=max=arr[0];
          for(i=1; i<num; i++)
             {
               if(min>arr[i])
	            	  min=arr[i];   
	       	     if(max<arr[i])
		             max=arr[i];       
             }
          System.out.println("The min value of array is:"+min);
          System.out.println("The max value of array is:"+max);


	}

}
