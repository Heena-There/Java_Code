//3)create Arraaylist of intiger and find its Median.create jar file.

package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class quo_3 {

	public static void main(String[] args) {
		List<Integer> inlist=new ArrayList<Integer>();
		inlist.add(25);
		inlist.add(15);
		inlist.add(20);
		inlist.add(38);
		inlist.add(40);
		inlist.add(52);
		inlist.add(10);
		inlist.add(6);
		
		Collections.sort(inlist);
		System.out.println(inlist);
		double median;
		int size=inlist.size();
		if(size%2==0)
			{
			int m1=inlist.get(size/2-1);
			System.out.println(m1);
			int m2=inlist.get(size/2);
			System.out.println(m2);
			median=m1+m2/2;
			}
		else {
			median=inlist.get(size/2);
		}
		System.out.println("Median is = "+median);
		

	}

}
