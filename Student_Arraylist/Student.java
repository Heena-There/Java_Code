//Create Student class with rollno,name,email,course,Marks.Use Arraylist to store
//Students details.and perform following operation:
//1)Add data
//2)show all data
//3)sort data based on rollno
//4)sort data based on name
//5)sort data based on Marks
//6)Create jar file 

package Student_Arraylist;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name, email, course;
	private int marks;

	public Student(int rollno, String name, String email, String course, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.course = course;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", course=" + course + ", marks="
				+ marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.rollno < o.rollno)
			return -1;
		else if (this.rollno>o.rollno)
			return 1;
		else
		return 0;
	}

}
