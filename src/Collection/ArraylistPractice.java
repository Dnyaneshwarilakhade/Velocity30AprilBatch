package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistPractice {
	public static void main(String[] args) {
		
		//Declaring an arraylist//common way of declaration==>homogeneous as well as heterogeneous
		
		ArrayList al=new ArrayList();
		
		//Generic declaratiom==>homogeneous data
		
		ArrayList<String>al1=new ArrayList<String>();
		ArrayList<Integer>al2=new ArrayList<Integer>();
		ArrayList<Character>al3=new ArrayList<Character>();
		
		//adding the values inside the arraylist
		al.add(15);//0
		al.add("ABC");//1
		al.add('A');//2
		al.add(20);//3
		al.add(null);
		
		System.out.println(al);
		
		//duplicate value
		al.add("ABC");
		System.out.println(al);
		
		//modifying arraylist
		al.add(2,'B');
		System.out.println(al);
		
		//Data Replace
		al.set(2, "XYZ");
		System.out.println(al);
		
		//data remove
		//al.remove(4);
		System.out.println(al);
		
		
		al.add(null);
		al.add(null);
		al.add(null);
		
		//checking the emptiness
		System.out.println(al.isEmpty());
		
		//size
		System.out.println(al.size());
		
		//location of information==>index
		System.out.println(al.lastIndexOf(15));
		
		//Contains==>check avaibility of data
		System.out.println(al.contains("PQR"));

		//get==>will help you to find data at particular index
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		
		
		//to read full arraylist==>regular expression
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
	System.out.println();
	
	//advanced for loop
	
	for(Object value:al) {
		System.out.print(value+" ");
	}
	
	System.out.println();
	
	
	//cursur
	
	//iterator==>scope==>full collection interface
	
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	
	//list iterator==>scope==>list interface
	ListIterator litr=al.listIterator();
	while(litr.hasNext()) {
		System.out.print(litr.next()+" ");
	}
	System.out.println();
	
	System.out.println(" arraylist before reversing is"+al );
	//reverse order
	Collections.reverse(al);
	System.out.println(al+" ");
	System.out.println();
	
	Iterator itr1=al.iterator();
	while(itr1.hasNext()) {                         //for retriving the data in the array
		System.out.print(itr1.next()+" ");
	}
	
	
	
	
	
	}

}
