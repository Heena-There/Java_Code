package Abs_Package;

public abstract class Bounded_Shape {
	int x,y;

	public Bounded_Shape(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Bounded_Shape [x=" + this.x + ", y=" + this.y + "]";
	}
	
	public abstract double area();   
//	The abstract method area in type Bounded_Shape can only be defined by an abstract class
	

}
