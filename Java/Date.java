import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int  year;
	
	public Date()//default constructor
	{
		
		
	}
	
	public Date(int dy,int mn,int yr)//parameterized constructor
	{
		
		day=dy;
		month=mn;
		year=yr;
	}
	
	
	
public void setDay(int day) {
		this.day = day;
	}
   
public int getDay(){
	return day;
}

public void setMonth(int month) {
	this.month = month;
}

public int getMonth() {
	return month;
}

public void setYear(int year) {
	this.year = year;
}

public int getYear() {
	return year;
}

public void display()
	{  
	   System.out.println("The Birth date is="+day+"/"+month+"/"+year);
	}

}
