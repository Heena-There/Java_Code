package Hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Hash_map {

	public static void main(String[] args) {
		Map<Double,String> hm=new HashMap<Double,String>();
		System.out.println(hm.put(56.32,"Temperature"));
		System.out.println(hm.put(85.45, "Frequecy"));
		System.out.println(hm.put((double) 5,"Speed"));
		System.out.println(hm);
		
		System.out.println("Enter the Key and Values");
		Scanner sc=new Scanner(System.in);
		System.out.println(hm.putIfAbsent(sc.nextDouble(), sc.next()));
		System.out.println(hm);
		
		Collection<String> names=hm.values();
		System.out.println(names);
		
		Collection<Double> keys=hm.keySet();
		System.out.println(keys);
		
		TreeMap tr=new TreeMap(hm);
		System.out.println(tr);
		
		for(String s :hm.values()) {
			System.out.println(s);
		}
		
		double no=sc.nextDouble();
		System.out.println(hm.remove(no));
		System.out.println(hm);
		
		no=sc.nextDouble();
		System.out.println(hm.get(no));
		System.out.println(hm);
		

	}

}
