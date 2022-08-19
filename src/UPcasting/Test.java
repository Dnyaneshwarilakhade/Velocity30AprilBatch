package UPcasting;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		//parent class
		
		Father f=new Father();
		f.car();
		f.home();
		f.money();
		
		System.out.println("--------------------------");
		
		//child class
		
		Son s=new Son();
		s.car();
		s.home();
		s.bike();
		s.money();
		
		
		
		//upcasting ==>parent reference is used to hold the child object but only those properties
		//are elligible for upacsting process which are declared in parent
		
		
		System.out.println("-----------------------");
		
		Father f1=new Son();
		f1.car();//parent car
		f1.home();//parent home
		f1.money();///50
		
		
		//downcasting :child reference is used to hold the parent  object is not possible
		
//		System.out.println("--------------------------");
//		
//		Son s1=(Son) new  Father();
//		s1.bike();
//		s1.car();
//		s1.home();
//		s1.money();
		
		
		
		//ArrayList al=new ArrayList();   //regular way of declaration
		
		List al1=new ArrayList(); //upcasting process//upcasting approach of declaration
		
		List al2=new LinkedList();
		
		List al3=new Vector();
		
		
		HashSet sh=new HashSet();
		Set sh1=new HashSet();  //upcasting process
		
		
		
		
	}
}
