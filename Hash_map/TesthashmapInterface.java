package Hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TesthashmapInterface {

	public static void main(String[] args) {
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println(hm.put(101,"Shiv"));
		System.out.println(hm.put(106,"Geeta"));
		System.out.println(hm.put(100,"Ajay"));
		System.out.println(hm.put(110,"Bala"));
		System.out.println(hm);
		
		System.out.println("Enter the Key and Values");
		Scanner sc=new Scanner(System.in);
		System.out.println(hm.putIfAbsent(sc.nextInt(), sc.next()));
		System.out.println(hm);

//		to show the values details
		Collection<String> names=hm.values();
		System.out.println(names);
		
//		to show the keys details
		Collection<Integer> keys=hm.keySet();
		System.out.println(keys);
		
//		to sort
		
		TreeMap tr=new TreeMap(hm);
		
		
		
		
		

	}

}
