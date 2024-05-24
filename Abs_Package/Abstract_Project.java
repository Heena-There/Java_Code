package Abs_Package;

public class Abstract_Project {

//	public static void main(String[] args) {
//
//		Circle cobj = new Circle(15, 20, 5);
//		System.out.println(cobj.area());
//
//		Rectangle robj=new Rectangle(9,8,5,6);
//		System.out.println(robj.area());
//	}
	
	//RULE: we never create object of abstract classes 

	// bs is reference of abstract class
	// Initially bs is referring to Circle class object
	// so as soon as we write bs.area() method will be called from Circle class

	//later on bs is referring to Rectangle class object
	// so as soon as we write bs.area() method will be called from Rectangle class

	// area() is called at run time 
	// it is changing dynamically

	// DYNAMIC METHOD DISPATCH (RUN TIME POLYMORPHISIM)



//	public static void main(String[] args) {
//		Bounded_Shape bs;
//		bs=new Circle(15,20,6);
//		System.out.println(bs.area());
//		
//		bs=new Rectangle(9,8,5,6);
//		System.out.println(bs.area());
//	}

	
	
	public static void main(String[] args) {

		Bounded_Shape bs[]={new Circle(15,10,8),new Rectangle(9,8,5,9)};
		for (Bounded_Shape b:bs)
			System.out.println(b.area());
		}
}
