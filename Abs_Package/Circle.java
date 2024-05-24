package Abs_Package;

public class Circle extends Bounded_Shape

{
	private double radius;
	
//	constructor
	public Circle(int x, int y,double radius) {
		super(x, y);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]"+ super.toString();
	}

	@Override
	public double area() {
		System.out.println("Calling area from the Circle Class");
		return Math.PI*radius*radius;
	}
	

}
