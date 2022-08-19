package Methodspractice;

public class StaticExample {
static int a=10;
int b=20;

public static void m1() {
	System.out.println("this is static method m1");
}
public void m2() {
	System.out.println("this is non static method m2");
}
public void m3() {
	System.out.println("--------------------");
	System.out.println(a);
	System.out.println(b);
	m1();
	m2();
}
public static void main(String[] args) {
	//rule 1:static methods can access static members directly.(without creating object)
	System.out.println(a);
	m1();
	System.out.println("----------------------");
	
	
	//rule 2:static methods can acess non static members through objects only.
	StaticExample se=new StaticExample();
	System.out.println(se.b);
	se.m2();
	
	//rule 3:
	//non static methods can accses both static and non static members dirctly
	
	se.m3();
	System.out.println("--------------");
	StaticExample se1=new StaticExample();
	se1.m3();
	
	
}
}
