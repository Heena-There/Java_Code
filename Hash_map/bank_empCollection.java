package Hash_map;

import java.util.HashMap;
import java.util.Map;

public class bank_empCollection {
	
	public static Map<Integer,bank_emp> getallempdetails(){
		Map<Integer,bank_emp> hm=new HashMap<Integer,bank_emp>();
		hm.put(101, new bank_emp(101,"Harsh",458963,"Vijaynagar",78584));
		hm.put(109, new bank_emp(109,"Shiv",458758,"Guntur",78145));
		hm.put(103, new bank_emp(103,"Deepa",458458,"Bharat",78875));
		hm.put(105, new bank_emp(105,"Aarti",458896,"Goa",78756));
		hm.put(113, new bank_emp(113,"Revti",458457,"India",79784));
		return hm;
		
	}

}
