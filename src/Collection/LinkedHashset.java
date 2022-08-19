package Collection;

import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		
		LinkedHashSet <String>sh=new LinkedHashSet<String>();
		
		//adding the elements inside the linked hashset
		
		sh.add("Y");
		sh.add("B");
		sh.add("C");
		sh.add("D");
		sh.add("E");
		sh.add("F");
		sh.add("Z");
		sh.add("L");
		
		
		System.out.println(sh);
		
		//adding the duplicate data/value  
		sh.add("A");
		sh.add("B");
		System.out.println(sh);
		
		//finding the no of elements in hashset i.e.size
		System.out.println(sh.size());
		
		//checking the presence of element 
		
		System.out.println("checking the presence of element: "+sh.contains("L"));
		
		//removing the element 1)Direct 2)Removal with status
		System.out.println(sh.remove("L"));
		System.out.println(sh);
		
		
		System.out.println(sh.remove("D"));
		System.out.println(sh);
		
		
		
	} 

}
