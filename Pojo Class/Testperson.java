package Package_3_Test;
import package_3.Person;

public class Testperson {

	public static void main(String[] args) {
		Person pobj=new Person("Nilesh",40,"Pune");
		Person pobj1=new Person("Hemant",42,"Mumbai");
		pobj.disp();
		pobj1.disp();
		pobj.setName("Niraj");
		pobj.disp();
		pobj.disp();
		int age=pobj1.getAge();
		System.out.println(age);
		pobj.setName("Vishal");
		pobj.setAge(49);
		pobj.setCity("Banglore");
		pobj.disp();
		String city=pobj.getCity();
		System.out.println(city);
		


	}

}
