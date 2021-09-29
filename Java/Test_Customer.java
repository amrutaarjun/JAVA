
public class Test_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.acceptInfo();
		//c1.getCreditLimit();
		c1.showDetails();
		
		Customer c2=new Customer();
		c2.acceptInfo();
		c2.setCreditLimit(45000);
		c2.showDetails();
		
		

	}

}
