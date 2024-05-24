package Package_3_Test;
import package_3.student;

public class Teststudent {

	public static void main(String[] args) {
		student std1=new student();
		std1.disp_Info();
		std1.acceptInfo(101, 67, 85, 56);
		std1.acceptInfo(102, 96, 63, 85);
		std1.acceptInfo(103, 75, 85, 89);
		std1.disp_Info();
		student std2=new student();
		std2.disp_Info();

	}

}
