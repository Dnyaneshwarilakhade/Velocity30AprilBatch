package StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class tp {
	public static void main(String[] args) {
		
		//removal of duplicate words from given String
		
		String str="i am am rahul rahul";
		
		String words[]=str.split(" ");   //split the string
		
		Set<String>s=new LinkedHashSet<String>();   //set no duplicate data
		
		for(String unique:words) {
			s.add(unique);
		}
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
