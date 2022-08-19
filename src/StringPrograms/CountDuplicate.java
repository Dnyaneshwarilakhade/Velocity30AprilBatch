package StringPrograms;

import java.util.HashMap;

public class CountDuplicate {
	public static void main(String[] args) {
		
		//counting of duplicate words from given string
		
		String str="i am am am am rahul rahul";
		
		String words[]=str.split(" ");
		
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		
		for(String word:words) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}
			else {
				hm.put(word, 1);
			}
		}
		
		System.out.println(hm);
	}

}
