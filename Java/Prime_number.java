
public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int num=0;
		String primeNumb= "";
		for(i=0;i<=10;i++)
		{
			int counter=0;
			for(num=i ;num>=1; num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				primeNumb= primeNumb+i+" ";
			}
		}
		System.out.println("Prime numbers from 1 to 10 are:" +primeNumb);

	}

}
