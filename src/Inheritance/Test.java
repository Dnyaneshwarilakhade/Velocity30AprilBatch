package Inheritance;

public class Test {
public static void main(String[] args) {
	
	//parent class object==>m1
	
	
	Parent p=new Parent();
	p.m1();
	
	System.out.println("--------------");
	
	//child class ==>m1/m2
	child c=new child();
	c.m1();
	c.m2();
}
}
