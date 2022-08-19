package InterfaceConcept;

public class Staticimp implements I2,I1{

	
	int a;
	int b;
	int c;
	@Override
	public void m3(int x, int y) {
		a=x;
		b=y;
		c=a+b;
		System.out.println("sum is "+c);
		
	}

	@Override
	public void m2(int x, int y) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		Staticimp s=new Staticimp();
		s.m3(25,20);
		s.m2(10,20);
		I1.m6();
	}

}
