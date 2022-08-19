package InterfaceConcept;

public class Test implements ABC{
	
	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}
	
	
	public void sum(int x, int y) {
		System.out.println(x+y);
		
	}
	public void mod(int x, int y) {
		System.out.println(x%y);
		
	}
	
	
	public int division(int x, int y) {
		
		return (x/y);
	}
	
	
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m2();
		t.sum(20,30);
		t.mod(10, 20);
		System.out.println(t.division(10,20));
	}
	

}
