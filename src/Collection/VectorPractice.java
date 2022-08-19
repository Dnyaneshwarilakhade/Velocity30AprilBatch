package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPractice {
public static void main(String[] args) {
	
	Vector v=new Vector();
	
	//adding the values inside the arraylist//CALLING
	v.add(15);
	v.add("ABC");
	v.add('A');
	v.add(25);
	
	System.out.println(v);
	
	//modifying arraylist
	v.add(2,'B');
	System.out.println(v);
	
	//data replace
	v.set(2,"XYZ");  //shift data
	System.out.println(v);
	
	//data remove
	//v.remove(2);==>will not add null simply delete
	System.out.println(v);
	
	v.add(null);
	v.add(null);
	v.add(null);
	v.add("ABC");
	v.add(23);
	v.add(54);
	
	System.out.println(v);
	
	//capacity of vector
	System.out.println("the capacity of vector is:"+v.capacity());
	
	//size of vector
	System.out.println("the size of vector is:"+v.size());
	
	//checking the emptiness
	System.out.println(v.isEmpty());
	
	//size 
	System.out.println(v.size());
	
	
	//location of information==>index
	System.out.println(v.indexOf(15));
	System.out.println(v.lastIndexOf("ABC"));
	
	//contains ==check the availbity
	// of the data
	System.out.println(v.contains("PQR"));
	
	//get ==>will help u to find datat at particulr index
	System.out.println(v.get(1));
	System.out.println(v.get(2));
	
	//to read full arraylist==>regular expression
	for(int i=0;i<v.size();i++) {
		System.out.print(v.get(i)+" ");
	}
	System.out.println();
	
	//advanced for loop
	for(Object value:v) {
		System.out.print(value+" ");
	}
	System.out.println();
	
	//iterator==>scope==>full collection interface
	Iterator itr=v.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	
	//list iterator==>scope==>list interface
	
	ListIterator litr=v.listIterator();
	while(litr.hasNext()) {
		System.out.print(litr.next()+" ");
	}
	System.out.println("this is from enumerator");
	
	Enumeration en=v.elements();
	while(en.hasMoreElements()) {
		System.out.print(en.nextElement()+" ");
	}
	System.out.println();
	
	//reverse order
	Collections.reverse(v);
	System.out.println(v+" ");
	System.out.println();
	
	Iterator itr1=v.iterator();
	while(itr1.hasNext()) {
		System.out.print(itr1.next()+" ");
	}
	
}
}
