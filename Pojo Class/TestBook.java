package Package_3_Test;
import package_3.Book;

public class TestBook {

	public static void main(String[] args) {
		Book obj=new Book();
		obj.disp();
		obj.setBname("Nilesh");
		obj.setId(951);
		obj.setAuthor("Rakesh");
		obj.disp();
		String author=obj.getAuthor();
		System.out.println(author);
		

	}

}
