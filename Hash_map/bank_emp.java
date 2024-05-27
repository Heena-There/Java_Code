//Create bank_emp class with empid,empname,accountno,branchname,salary.Use HashMap to store
//Employee details use empid as key.and perform following operation:
//1)Add data
//2)show all data
//3)sort data
//4)accept key from user and remove record of given key
//5)accept key from user and display data for given key
//6)Create jar file 

package Hash_map;

public class bank_emp {
	private int empid;
	private String empname;
	private int accountno;
	private String branchname;
	private double salary;
	
	public bank_emp(int empid, String empname, int accountno, String branchname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.accountno = accountno;
		this.branchname = branchname;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "bank_emp [empid=" + empid + ", empname=" + empname + ", accountno=" + accountno + ", branchname="
				+ branchname + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
