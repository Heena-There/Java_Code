package Package_3_Test;
import package_3.Date;

public class TestDate {

	public static void main(String[] args) {
		Date dobj=new Date();
		dobj.setDd(15);
		dobj.setMm(06);
		dobj.setYy(1991);
		dobj.disp();
		Date dobj2=new Date(16,02,1996);
		dobj2.disp();
	}

}
