//pojo class

package Book_Pack;

public class book implements Comparable<book> {
	private int bookid;
	private String bookname, author;
	private double price;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(book o) {
		if (this.bookid < o.bookid)
			return -1;
		else if (this.bookid > o.bookid)
			return 1;
		else
			return 0;
	}

	public book(int bookid, String bookname, String author, double price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
}
