import java.util.Scanner;

public class Array_upeercase {
	
	public static void accept_array()
	{  
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of String array:");
		int n=sc.nextInt();
		String[] arr=new String[n];
		
		System.out.println("Enter  the elements in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("-----------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The elements in the array is:  "+arr[i]);
			System.out.println("The elements in the Upper case is:  "+arr[i].toUpperCase());
		}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accept_array();

	}

}
