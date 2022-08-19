package Inheritance;

public class Sample extends Sample1 {

	
	int a=10;     //Global variable decl initi
	
	
	public void test() {
		
		int a=20;     //local variable
		
		System.out.println(a);           //10
		System.out.println(this.a);    //20
		System.out.println(super.a);    //30
		
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
		s.test();
	}
}
