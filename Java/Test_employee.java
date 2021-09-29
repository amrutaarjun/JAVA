import java.util.Scanner;
public class Test_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		Employee[] allEmp=new Employee[5];
		
		for(int i=0;i<allEmp.length;i++)
		{
			System.out.println("Enter details of"+" "+(i+1)+" "+"Emp");
			allEmp[i]=new Employee(s.nextInt(),s.next(),s.next(),s.nextDouble());
		
			
		}
		
	
		for(int i=0;i<allEmp.length;i++)
		{
			allEmp[i].display();
		}
		for(Employee e:allEmp)
		{
			//e.display();
			if(e.getSalary()>20000)
			{   
				System.out.println("The name of employee whos salary is greater than 20000:");
				System.out.println(e.getName());
			}
		}
		
		
		
		/*emp1.setEmpid(101);
		emp1.getEmpid();
        emp1.setName("Amruta");
        emp1.getName();
        emp1.setAddress("Pune");
        emp1.getAddress();
        emp1.setSalary(30000);
        emp1.getSalary();
        emp1.display();*/
       
        
        
        
        
        
	}

}

