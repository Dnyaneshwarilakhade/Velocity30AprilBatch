package Methodspractice;

public class StaticKeyword {

	int empid;
	String name;
	static int dept;
	
	public void display() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(dept);
	}
	public static void main(String[] args) {
		 StaticKeyword sk1=new  StaticKeyword();
		 sk1.empid=101;
		 sk1.name="ABC";
		 dept=100;
		 sk1.display();
		 System.out.println("----------------");
		 
		 
		 StaticKeyword sk2=new  StaticKeyword();
		 sk2.empid=102;
		 sk2.name="LMN";
		 sk2.display();
		 System.out.println("----------------------");
		 
		 }
}
