package Book_Pack.util;
import Book_Pack.book;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
	public static List<book> geteachbook(){

List<book> books=new ArrayList<book>();
		book bks=new book(10,"Java","James Gosling",120);
		books.add(bks);
		books.add(new book(20,"C++","Bjarne Stroustrup",150));
		books.add(new book(30,"C#","Jennifer Greene",100));
		books.add(new book(5,"SQL","Anthony Molinari",90));
		books.add(new book(1,"Python","Eric Matthes",500));

		return books;
		
	}

}
