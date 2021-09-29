import java.util.Scanner;

public class Operations_on_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num,min,max,choice;
	    float total=0 , average;
		boolean flag = false;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array:");
	    num=sc.nextInt();
	    int[] array=new int[num];
	    
	    System.out.println("Enter numbers in array:");
	    for (i = 0; i < num; i++)
	    {
	        array[i]=sc.nextInt();
	    }
	    System.out.println("Elements in array are:");
	    for (i = 0; i < num; i++)
	    {
	    	 System.out.println(+array[i]);
	    }
	    System.out.println("1. Sum and Average");
	    System.out.println("2. Min and Max");
	    System.out.println(" Your choice :? ");
	    
	    while (flag != true)
	    {
		   System.out.println("Enter Choice:");
		   choice = sc.nextInt();
	   
	      switch(choice)
	      {
	         case 1:
	        	 for (i = 0; i < num; i++)
	                {
		                total+=array[i];
	                }
	                 average = total / num;
	                 System.out.println("Sum of all numbers = "+total);
	                 System.out.println("Average of all input numbers = "+average);
	                 break;
	         case 2:	             
		            
		            min=max=array[0];
		            for(i=1; i<num; i++)
		               {
		                 if(min>array[i])
			            	  min=array[i];   
			       	     if(max<array[i])
				             max=array[i];       
		               }
		            System.out.println("The min value of array is:"+min);
		            System.out.println("The max value of array is:"+max);
		            break;
	         case 3:
	        	     flag = true;
	        	     break;	       
	           
	      }   
	    
	    } 

	}

}
