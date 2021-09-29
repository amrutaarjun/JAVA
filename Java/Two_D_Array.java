import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the row size of array:");
		int n1=sc.nextInt();
		System.out.println("Enter the column size of array");
		int n2=sc.nextInt();
		int[][] arr=new int[n1][n2];
		System.out.println("Enter the array elements:");

		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("_______________________________");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
		       System.out.print( +arr[i][j]+ " ");
			}
			System.out.println();
		}		

	}

}
