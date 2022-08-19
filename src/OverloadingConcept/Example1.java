package OverloadingConcept;

public class Example1 {

	//add:overload
   //add:int int
	//add:int double
	   //add:double double
	//add:double double double
	   //add:int int int
	
	//addition logic ==>internal variation
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,double b) {
		System.out.println(a+b);
	}
	public void add(double a,int b) {
		System.out.println(a+b);
	}
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	public void add(double a,double b,double c) {
		System.out.println(a+b+c);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Example1 ex=new Example1();
		ex.add(20,20);
		ex.add(50.5,50);
		ex.add(25.5, 25.5, 25.5);
		ex.add(20, 40.5);
		ex.add(50,50,50);
		
	}
	
}
