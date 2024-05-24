//1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
//Accept data (acceptInfo()) and display  using display member function.
//Also display total,percentage and grade.

package package_3;

public class student {
	private int roll_no;
	private int marks1;
	private int marks2;
	private int marks3;
	
	public void acceptInfo(int rn,int mrk1,int mrk2,int mrk3)
	{
		System.out.println("---Accept info of Student----");
		roll_no=rn;
		marks1=mrk1;
		marks2=mrk2;
		marks3=mrk3;
	}
	
	public void disp_Info()
	{
		System.out.println("-------------Display Student marks Info---------------------");
		System.out.println("Roll No:"+roll_no+"Marks1="+marks1+" Marks2="+marks2+" Marks3="+marks3);
	}

}
