package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractise {
	public static void main(String[] args) {
		
		TreeSet <String> sh=new TreeSet<String>();
		
		//add the values
		
		sh.add("Z");
		sh.add("A");
		sh.add("B");
		sh.add("P");
		sh.add("L");
		sh.add("F");
		sh.add("K");
		sh.add("G");
		sh.add("C");
		
		
		System.out.println(sh);///ascending order
		
		sh.add("A");
		sh.add("Z");
		sh.add("P");
		System.out.println(sh);
		
		//presence of elements
		System.out.println(sh.contains("L"));
		
		
		//to check first and last element in treeset
		
		System.out.println(sh.first());
		System.out.println(sh.last());
		
		//removing first and last element
		sh.pollFirst();
		sh.last();
		System.out.println(sh);
		
		
		//checking the immediate higher and lower
		String val="C";
		System.out.println("Higher value is:"+sh.higher(val));
		System.out.println("Lower value is:"+sh.lower(val));
		
		//reading the values
		Iterator itr=sh.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		for(String value:sh) {
			System.out.print(value+" ");
		}
		
		
		
		
		
	}

}
