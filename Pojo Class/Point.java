//4. Create a class Point with data members as x,y. Create Default and Parameterized constructors. 
//add the display function. Create the object of this 
//class in main method and invoke all the methods in that class.

package package_3;

public class Point {
	private int x;
	private int y;

	public Point() {
//		super();
		this.x = 12;
		this.y = 24;
	}

	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println("X="+x+" "+"Y="+y);
	}

}
