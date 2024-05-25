import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection_Arraylist {

	public static void main(String[] args) {
		System.out.println("1:show all 2:Add number 3:Remove number 4:Search 5:Clear 6:Sort");
		List<Integer> p1 = new ArrayList<Integer>();
		p1 = Add_Arraylist.getallNumbers();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter the Choice:");
			ch = sc.nextInt();

			switch (ch) {
				case 1: 
					System.out.println("------Show all Records------");
					for(int ele: p1)
						System.out.println(ele + " ");
					System.out.println();
					break;
					
				case 2:
					System.out.println("----Add Number----");
					p1.add(sc.nextInt());
					break;
					
				case 3: 
					System.out.println("----Remove Number----");
					System.out.println("Enter the number for removal:");
					Integer no=sc.nextInt();
					System.out.println("Remove No:"+p1.remove(no));
					break;
					
				case 4:
					System.out.println("----Search Index----");
					System.out.println("Enter the number for Search:");
					no=sc.nextInt();
					System.out.println("Index of given no is:"+p1.indexOf(no));
					break;
					
				case 5:
					System.out.println("----clear----");
					p1.clear();
					System.out.println("Is_Empty:"+p1.isEmpty());
					break;
					
				case 6:
					System.out.println("----sort----");
					Collections.sort(p1);
					for(int ele:p1)
						System.out.println(ele+" ");
					break;
					
				default:
					break;
					
					
			}
		} while (ch != 7);

	}

}
