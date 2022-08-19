package Collection;

import java.util.HashMap;

public class ImportantCollection {
public static void main(String[] args) {
	
	
			 
			// Removal of duplicate words from given String
			
//			String str ="I am am rahul rahul";
//			String words [] = str.split(" ");
//			Set <String> s = new LinkedHashSet<String>();
//			
//			for (String unique:words) {
//				s.add(unique);
//			}
//			
//			Iterator<String> itr = s.iterator();
//			while (itr.hasNext()) {
//				System.out.print(itr.next()+" ");
//			}
			
			// counting of duplicate words from given string
			
			String str ="I am am am am rahul rahul";
			String words [] = str.split(" ");
			
			HashMap <String, Integer>hm = new HashMap<String, Integer>();
			
			for( String word:words) {
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


