package InterfaceConcept;

public class MultipleInheritanceinter implements Sample1,Sample2 {

	
	public void m3() {
		System.out.println("this is complete method from interface sample2");
		
		
	}

	@Override
	public void m4() {
		System.out.println("this is complete method from interface sample2");
		
		
	}

	@Override
	public void m1() {
		System.out.println("this is complete method from interface sample1");
		
		
	}

	@Override
	public void m2() {
		System.out.println("this is complete method from interface sample1");
		
		
	}
	public static void main(String[] args) {
		MultipleInheritanceinter m=new MultipleInheritanceinter();
		m.m1();
		m.m2();
		m.m3();
		m.m4();
	}

}
