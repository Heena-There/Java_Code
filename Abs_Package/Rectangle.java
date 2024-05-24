package Abs_Package;

public class Rectangle extends Bounded_Shape
{
	double l, b;

	public Rectangle(int x, int y, double l, double b) {
		super(x, y);
		this.l = l;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]" + super.toString();
	}

	@Override
	public double area() {
		System.out.println("Calling area from the Rectangle Class");
		return l*b;
	}
	
	
	
	
	
	

}
