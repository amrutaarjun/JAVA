/*Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchesed items. */

import java.util.Scanner;

public class Stationary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int cost,quantity,choice=0;
		  int total_cost=0,sum=0;
		  boolean flag=false;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Which items you want:");

	      System.out.println("1. Pen");
	      System.out.println("2. Pencil");
	      System.out.println("3. Notebook");
	      System.out.println("4. Bottle");	      
	      System.out.println("5. colorBox");
	      while(flag!=true)
	      {
	    	  System.out.println("Enter Your Choice:?");
	    	  choice=sc.nextInt();
	      switch(choice)
	      {
	           case 1:
	        	   System.out.println("What is the price of 1 pen");
	        	   System.out.println("10/-");
	        	   System.out.println("How many pen you want:?");
	        	   quantity=sc.nextInt();	        	   
	        	   total_cost=quantity*10;
	        	   System.out.println("The total price of pen:"+total_cost);
	        	   sum=sum+total_cost;
	        	   break;
	        	   
	           case 2:
	        	   System.out.println("What is the price of 1 Pencil ");
	        	   System.out.println("05/-");
	        	   System.out.println("How many pencils you want:?");
	        	   quantity=sc.nextInt();
	        	   total_cost=quantity*05;
	        	   System.out.println("The total price of pencil:"+total_cost);
	        	   sum=sum+total_cost;
	        	   break;
	        	   
	           case 3:
	        	   System.out.println("What is the price of 1 Notebook");
	        	   System.out.println("20/-");
	        	   System.out.println("How many Notebook you want:?");
	        	   quantity=sc.nextInt();	        	   
	        	   total_cost=quantity*20;
	        	   System.out.println("The total price of Notebook:"+total_cost);
	        	   sum=sum+total_cost;
	        	   break;
	        	   
	           case 4:
	        	   System.out.println("What is the price of 1 Bottle");
	        	   System.out.println("30/-");
	        	   System.out.println("How many Bottle you want:?");
	        	   quantity=sc.nextInt();
	        	   total_cost=quantity*30;
	        	   System.out.println("The total price of  Bottle:"+total_cost);
	        	   sum=sum+total_cost;
	        	   break;
	        	   
	           case 5:   
	        	   System.out.println("What is the price of 1 Colorbox");
	        	   System.out.println("50/-");
	        	   System.out.println("How many Colorbox you want:?");
	        	   quantity=sc.nextInt();
	        	   total_cost=quantity*50;
	        	   System.out.println("The total price of Colorbox:"+total_cost);
	        	   sum=sum+total_cost;
	        	   break;
	        	   
	           case 6:
	        	   flag=true;
	        	   break;
	      }	   
	 
	    }
	      System.out.println("The total price of items is:"+sum);
	      
	      

	}

}
