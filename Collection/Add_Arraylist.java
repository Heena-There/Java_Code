import java.util.ArrayList;
import java.util.List;

public class Add_Arraylist {
	public static List<Integer> getallNumbers() {
		int[] data = { 10, 20, 30, 85, 45, 96, 52, 10 };
		List<Integer> list = new ArrayList<Integer>();
		for (int ele : data)
			list.add(ele);
//		System.out.println(list + " ");
//		all.add(3, 91);
//		System.out.println(list + " ");
//
//		System.out.println("Size of list=" + list.size() + " " + "Is_Empty=" + list.isEmpty());
//		System.out.println(list.indexOf(85));
		return list;

	}
}