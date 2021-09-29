
public class Pattern {
	
	public static void starpattern(int n)
	{
		int i,j;
		for(i=0;i<n;i++) 
		{
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		starpattern(n);

	}

}
