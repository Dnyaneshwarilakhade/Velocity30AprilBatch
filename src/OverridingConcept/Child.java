package OverridingConcept;

public class Child extends Parent {

	public void marriage() {
		System.out.println("love marriage");
	}
	
	
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.property();
		p.marriage();
		
		Child c=new Child();
		c.property();
		c.marriage();
		
	}
}

