package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		//adding the data to hashset
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		System.out.println(set);  //randomly inserting in the hash
		
		//adding the duplicate data
		set.add("two");
		set.add("five");
		System.out.println(set);
		
		//adding the data in with the help of arraylist
		
		ArrayList al=new ArrayList();
		al.add("five");
		al.add("six");
		al.add("seven");
		al.add("eight");
		al.add("nine");
		al.add("ten");
		
		System.out.println(al);
		
		set.addAll(al);
		System.out.println(set);
	
		//finding the size of hashset
		System.out.println("the size of hashset is:"+set.size());
	
		
		//checking the presence of any element
		
		System.out.println(set.contains("eleven"));

		//removing the elements from hashset
		set.remove("one");
		System.out.println(set);
		
		System.out.println(set.remove("two"));
		
		System.out.println(set);
		
		//iterator
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	
	}

}
