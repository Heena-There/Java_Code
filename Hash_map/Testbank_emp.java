package Hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Testbank_emp {

	public static void main(String[] args) {
		Map<Integer, bank_emp> hash = new HashMap<Integer, bank_emp>();
		hash = bank_empCollection.getallempdetails();

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println(
				"1:Add data 2:show all data 3:sort data 4:accept key from user and remove record of given key 5:accept key from user and display data for given key");

		do {
			System.out.println("Enter the Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("----Add data----");
				Map<Integer, bank_emp> hnewobj = new HashMap<Integer, bank_emp>();
				hnewobj.put(sc.nextInt(),
						new bank_emp(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble()));
				System.out.println(hnewobj);
				break;

			case 2:
				System.out.println("----Show All----");
				for (bank_emp e : hash.values())
					System.out.println(e);
				break;

			case 3:
				System.out.println("----sort data----");
				TreeMap tr = new TreeMap(hash);
				
					System.out.println(tr);
					break;

//			TreeMap<Integer,bank_emp> sm = new TreeMap<Integer, bank_emp> (hash);
//			sm.values().stream().forEach(i -> System.out.println(i));
//			break;
//			
			case 4:
				System.out.println("----accept key from user and remove record of given key----");
				int no = sc.nextInt();
				System.out.println(hash.remove(no));
				break;
				
			case 5:
				System.out.println("---accept key from user and display data for given key---");
				no=sc.nextInt();
				System.out.println(hash.get(no));
				break;
			}

		} while (ch != 0);

	}

}
