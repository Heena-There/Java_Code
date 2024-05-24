
package Package_3_Test;
import package_3.Bank;

public class Test_Bank {

	public static void main(String[] args) {
	Bank bobj=new Bank(103,"Shivansh",100000,"shiv@gmail.com");
	bobj.disp();
	
	double b=bobj.getBalance();
	System.out.println("Balance="+b);
	
	bobj.withdraw(45000);
	b=bobj.getBalance();
	System.out.println("Balance="+b);
	
	bobj.deposite(50000);
	b=bobj.getBalance();
	System.out.println("Balance="+b);

	}

}
