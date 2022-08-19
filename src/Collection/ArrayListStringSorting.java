package Collection;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListStringSorting {
	public static void main(String[] args) {
		
		//arraylist declaration==>general way
		ArrayList<String> list=new ArrayList<String>();
		
		
		//adding the elements
		list.add("audi");
		list.add("Activa");
		list.add("Maruti800");
		list.add("BMW");
		list.add("Bullet");
		list.add("nano");
		list.add("mercedez");
		
		System.out.println("Arraylist before sorting"+list);
		
		//sorting the arraylist in asecnding order
		
		Collections.sort(list);
		System.out.println("arraylist after sorting"+list);
		
		//sorting the arraylist in descending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("arraylist after sorting"+list);
		
		
	}

}
