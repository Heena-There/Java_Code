//3. Create a class Book with data members as bname,id,author,price.  Also add the display function.  Create 
//the object of this class in main method and invoke all the methods in that class. 


package package_3;

public class Book {
	private String bname;
	private int id;
	private String author;
	private float price;
	
	
	public Book() {
//		super();
		this.bname="bhauji";
		this.id=345;
		this.author="Chandrabhushan";
		this.price=450;
	}

	public Book(String bname, int id, String author, float price) {
//		super();
		System.out.println("-----Parametrisied Constructor-----");
		this.bname = bname;
		this.id = id;
		this.author = author;
		this.price = price;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void disp() {
		System.out.println("Book_name:"+bname+" "+"Book_id:"+id+" "+"Author:"+author+" "+"Price:"+price);
	}
	
	

}
