package Student_Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Student_Arraylist.Student;
import Student_Arraylist.Student_Collection;

public class TestStudent {

	public static void main(String[] args) {
		
		List<Student> lib=new ArrayList<Student>();
		lib=Student_Collection.getalldetails();
		
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("1:Add 2:show all 3:sort data based on rollno 4:sort data based on name 5:sort data based on marks");
		
		do {
			System.out.println("Enter the Choice:");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("-----Add-----");
			Student newobj=new Student(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
			lib.add(newobj);
			System.out.println("Added new Record:"+newobj);
			break;
			
			case 2: System.out.println("----Show All----");
			for(Student bk:lib)
				System.out.println(bk+" ");
			System.out.println(" ");
			break;
			
			case 3:Collections.sort(lib);
			System.out.println(lib+" ");
			break;
			
			case 4: System.out.println("----Sort by name----");
			Collections.sort(lib,new Studentsortbyname());
			for(Student bk:lib)
				System.out.println(bk);
			break;
			
			case 5: System.out.println("----Sort by marks----");
			Collections.sort(lib,new Studentsortbymarks());
			for(Student bk:lib)
				System.out.println(bk);
			break;
			
			default:
				break;
			}
		}while(ch!=0);
		
		
		

	}

}
