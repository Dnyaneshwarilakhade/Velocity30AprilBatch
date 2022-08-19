package InterfaceConcept;

public class Hybridinheritance extends LMN implements B1,B2{

	
	public void m3() {

		System.out.println("this is complete method of interface B2");
	}

	@Override
	public void m2() {
		System.out.println("this is complete method of interface B1");
		
	}

	@Override
	public void m4() {
		
		System.out.println("this is complete method of interface B1");  //logic ==>one time only of same methhod name
	}
	
	public static void main(String[] args) {
		Hybridinheritance h=new Hybridinheritance();
		h.m1();
		h.m2();
		h.m3();
		h.m4();
	}

}
