package Methodspractice;

public class Employee {

	int empid;
	String empname;
	double empsal;
	String job;
	
	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
		System.out.println(job);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empid=101;
		e1.empname="abc";
		e1.empsal=20000.75;
		e1.job="developer";
		e1.display();
		
		System.out.println("------------------------");
		
		Employee e2=new Employee();
		e2.empid=102;
		e2.empname="pqr";
		e2.empsal=40000.75;
		e2.job="tester";
		e2.display();
		
		System.out.println("-----------------------------");
		
		Employee e3=new Employee();
		e3.empid=103;
		e3.empname="xyz";
		e3.empsal=80000.75;
		e3.job="manager";
		e3.display();
		
		
	}
	
}