package Book_Pack;

import java.util.Comparator;

public class sortbookbyname implements Comparator<book> {

	@Override
	public int compare(book o1, book o2) {
		
		return o1.getBookname().compareTo(o2.getBookname());
	}

}
