package Book_Pack;

import java.util.Comparator;

public class sortbookbyprice implements Comparator<book> {

	

	@Override
	public int compare(book o1, book o2) {
		if(o1.getPrice()<o2.getPrice())
			return -1;
		else if(o1.getPrice()>o2.getPrice())
			return 1;
		else
		return 0;
	}

}
