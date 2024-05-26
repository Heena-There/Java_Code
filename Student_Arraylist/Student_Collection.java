package Student_Arraylist;
import java.util.ArrayList;
import java.util.List;

import Student_Arraylist.Student;

public class Student_Collection {
	public static List<Student> getalldetails(){
		List<Student> stud=new ArrayList<Student>();
		Student std1=new Student(101,"Shiv","shiv@gmail.com","BCA",90);
		stud.add(std1);
		stud.add(new Student(102,"Amay","amay@gmail.com","MCA",84));
		stud.add(new Student(103,"Riyansh","riyan@gmail.com","Bsc",75));
		stud.add(new Student(104,"Rahul","rahul@gmail.com","MSC",95));
		stud.add(new Student(105,"Bhargav","bhag@gmail.com","BCOM",98));
		stud.add(new Student(106,"Ziva","ziva@gmail.com","PHD",60));
		return stud;
		
	}
	

}
