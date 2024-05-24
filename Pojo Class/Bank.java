package package_3;

public class Bank {
	private int Account_id;
	private String Name;
	private double Balance;
	private String email;
	
	
	
	public Bank() {
//		super();
		this.Account_id=100;
		this.Name="Aatish";
		this.Balance=70000;
		this.email="aatish@gmail.com";
	}


	public Bank(int account_id, String name, double balance, String email) {
//		super();
		Account_id = account_id;
		Name = name;
		Balance = balance;
		this.email = email;
	}


	public int getAccount_id() {
		return Account_id;
	}


	public void setAccount_id(int account_id) {
		Account_id = account_id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public double getBalance() {
		return Balance;
	}


	public void setBalance(double balance) {
		Balance = balance;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public void disp() {
		System.out.println(Account_id+" "+Name+" "+Balance+" "+email);
	}
	
	public void withdraw(double amount) {
		System.out.println("---withdraw---");
		Balance=Balance-amount;
	}
	
	public void deposite(double amount) {
		System.out.println("---Deposite---");
		Balance=Balance+amount;
	}
	
	
	
	
	

}
