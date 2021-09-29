
public class Var_argument {
	public static void sum(int...a)
	{
		System.out.println("size="+a.length);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		  sum=sum+a[i];
		}
		System.out.println("sum is "+a.length+ " "+ "Elements:"+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		sum();
		sum(a,a,a,a,a);
		sum(a,a,a,a,a,a,a,a);

	}

}
