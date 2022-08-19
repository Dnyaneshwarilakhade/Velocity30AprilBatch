package InterfaceConcept;

public class DemoMain implements Demo1,Deom2 {

	@Override
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		
		DemoMain d=new DemoMain();
		d.m1();
	}
}
