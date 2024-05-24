//2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members. 
//Also add the display function.  Create the 
//object of this class in main method and invoke all the methods in that class.

package package_3;

public class Date {
	private int dd, mm, yy;

	public Date() {
//		super();
		System.out.println("-----Parameterless constructor get called------");
		this.dd = 1;
		this.mm = 10;
		this.yy = 1960;
	}

	public Date(int dd, int mm, int yy) {
//		super();
		System.out.println("-----Parameterisied constructor get called------");
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void disp()
	{
		System.out.println("Date:"+dd+" "+"Month:"+mm+" "+"Year:"+yy);
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

}
