package package_3;

class Date
{
	int dd,mm,yy;
	Date()
	{
		
	}
	void dispDate()
	{
		System.out.println("Date = "+this.dd+"-"+this.mm+"-"+"-"+this.yy);
	}
} //end of Date class

class Employee
{
	Date doj; // field // local reference of Date type // ASSOCIATION
	int eid; //field 
	
	Employee()
	{
		
	}
	void dispEmployee()
	{
		System.out.println("Employee id = "+this.eid+" DOJ = "+doj);
		doj.dispDate();
	}
	
} //end of Employee class

public class  Practice_Date{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();	
		e1.dispEmployee();
	}

}



