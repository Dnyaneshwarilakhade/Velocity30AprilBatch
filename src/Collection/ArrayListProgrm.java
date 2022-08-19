package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgrm {

	public static void main(String[] args) {
		//arraylist declaration
		ArrayList <Integer>num=new ArrayList<Integer>();
		ArrayList <String>str=new ArrayList<String>();
		
		//adding values
		num.add(50);
		num.add(30);
		num.add(150);
		num.add(189);
		num.add(23);
		num.add(523);
		num.add(14);
		num.add(36);
		
		//num.add(null);
		
		str.add("30 April");
		str.add("Batch");
		
		System.out.println("araaylist before sorting:"+num);   //null pointer error
		
		//sort the arraylist in ascending order
		Collections.sort(num);
		System.out.println("arraylist afetr sorting: "+num);
		
		//sort in descending
		Collections.sort(num,Collections.reverseOrder());{
			System.out.println("arraylist after sorting:"+num);
		}
		
	}
}
