package Methodspractice;

public class SampleMain {

	//main method ==>call
	public static void main(String[] args) {
		//static method
		
		Sample.m1();
		Sample.m2();
		
		//non static method ==>create object of the regular method class Sample
		Sample s1=new Sample(); //object creation
		s1.m3();
		s1.m4();
	}
}
