package OverloadingConcept;

public class Example2 {
	//method nature is not responsible in achieving overloading
	
	public void sum() {
		System.out.println("zero argument method");
	}
	public void sum(int a) {
		System.out.println("one argument method"+a);
	}
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public static void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void sum(double a,double b,double c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		sum(10,10,10);
		sum(5.5,5.5,5.5);
		
		Example2 ex=new Example2();
		ex.sum();
		ex.sum(25);
		ex.sum(50,50);
	}
	

	


	


}
