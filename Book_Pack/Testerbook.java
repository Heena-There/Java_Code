package Book_Pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import Book_Pack.book;
import Book_Pack.util.BookCollection;

public class Testerbook {

	public static void main(String[] args) {
		System.out.println("1:Show all 2:Add 3:show names   4:search book by id/author  5:show books price >400 6:sort");
		Scanner sc=new Scanner(System.in);
		int ch;
		List<book> library=new ArrayList<book>();
		library=BookCollection.geteachbook();
		
		do {
			System.out.println("Enter the choice:");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:System.out.println("----Show all----");
			for(book bk:library)
				System.out.println(bk+" ");
			break;
			
			case 2:System.out.println("----Add----");
			book newobj=new book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
			library.add(newobj);
			System.out.println("New record has been added");
			break;
			
			case 3:System.out.println("----Show Names----");
			for(book bk:library)
				System.out.println(bk.getBookname());
			break;
			
			case 4:System.out.println("----search book by id/author----");
			int no=sc.nextInt();
			book ele = library.get(no);
			break;
			
			case 5:System.out.println("---- show books price >400----");
			for(book bk:library)
			{
				if((bk.getPrice()>400)) {
					System.out.println(bk);
				}}
			break;
//			
			case 6: System.out.println("----sortbyname----");
			Collections.sort(library,new sortbookbyname());
			for(book bk:library)
				System.out.println(bk);
			break;
			
			case 7:System.out.println("----sortbyprice----");
			Collections.sort(library,new sortbookbyprice());
			for(book bk:library)
				System.out.println(bk);
			break;
			
			}
		}while(ch!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		book bks=new book(10,"Java","James Gosling",120);
//		library.add(bks);
//		library.add(new book(20,"C++","Bjarne Stroustrup",150));
//		library.add(new book(30,"C#","Jennifer Greene",100));
//		library.add(new book(5,"SQL","Anthony Molinari",90));
//		library.add(new book(1,"Python","Eric Matthes",500));
//		
//		do {
//			System.out.println("Enter the Choice:");
//			ch=sc.nextInt();
//			
//			switch(ch) {
//			case 1:
//				System.out.println("---Show all---");
//				for(book bk:library)
//					System.out.println(bk+" ");
//				System.out.println(" ");
//				break;
//				
//			case 2:
//				System.out.println("---Add---");
//				book newbookobj=new book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
//				library.add(newbookobj);
//				System.out.println("New items has been added");
//				break;
//				
//			case 3:
//				System.out.println("---show book name---");
//				for(book bk:library)
//					System.out.println(bk.getBookname());
//				break;
//				
//			case 4:
//				System.out.println("show book by id");
//				Integer ID =sc.nextInt();
////				for(book bk:library)
////					System.out.println(bk.getBookname());
////				System.out.println();
////				for(book bk:library)
////					
////					System.out.println(bk.getBookid()+" "+bk.getAuthor());
//				System.out.println(library.indexOf(ID)+bks.getAuthor());
//				break;
//				
//			case 5:
//				System.out.println("Remove Bookid");
//				ID=sc.nextInt();
//				System.out.println(bk.remove());
//				break;
//				
//				
//			}
//			
//			
//		}while(ch!=0);
//		
		
		
		
		
		

			
		
		

	}

	

	
}
