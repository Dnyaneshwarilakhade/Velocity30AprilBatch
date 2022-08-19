package Methodspractice;


public class Demo {

	//methods to call from same class.
	//2 static methods 2 nonstatic.
	//call them.
	
	public static void test1() {                 //static method
		System.out.println("this is method one static ");
	}
	public static void test2() {
		System.out.println("this is method two static");
	}
	
	public void test3() {      //nonstatic
	System.out.println("this is non static method three");
	 
	}
	
	public void test4() {
		System.out.println("this is non static method four");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method starts");
		//static method calling
		Demo.test1();
		Demo.test2();
		
		//nonstatic method calling
		Demo d1=new Demo(); //create object of Demo
		d1.test3();
		d1.test4();
		
		test1(); //static method in same class
		test2();
	}
	
	
}
