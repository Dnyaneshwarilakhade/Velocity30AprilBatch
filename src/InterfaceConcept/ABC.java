package InterfaceConcept;

public interface ABC {

	static final int b=20;
	int a=10;     //variables static and final
	int c=30;
	
	public abstract void m1() ;
	void m2(); //can declare like this 
	
	void sum(int x,int y); //method with parameter and no return type
	
	int division(int x,int y); //method with parameter and with return type
	
	public void mod(int x, int y);
}
