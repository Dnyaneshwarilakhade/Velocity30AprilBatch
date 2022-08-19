package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapPractice {
public static void main(String[] args) {
	
	//declaration of hashmap
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	//adding values to hashmap
	hm.put(101,"ABC");
	hm.put(102,"LMN");
	hm.put(103, "PQR");
	hm.put(104,"ABC");
	hm.put(105,null);
	hm.put(null,"ABC");
	
	System.out.println(hm);
	
	//adding duplicate keys
	
	hm.put(101,"ABC");
	hm.put(105,null);
	
	System.out.println(hm);
	//MODIfying the existing value
	hm.put(102,"DEF");
	System.out.println(hm);
	
	//removing the element
	hm.remove(104);
	System.out.println(hm);
	
	
	
//	******************most important
	//how to read the data==>key value pair
	for(Entry m:hm.entrySet()) {
		System.out.print(m.getKey()+" "+m.getValue()+" ");
	}
	
	
	
}
}
