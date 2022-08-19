package constructor;

public class Employee {
	
	int EmpNo,Sal;
	String EName,job;
	
	public Employee(int eno,String enm,String j,int s) {
		EmpNo=eno;
		EName=enm;
		job=j;
		Sal=s;
	}
	public void showData() {
		System.out.println(EmpNo);
		System.out.println(EName);
		System.out.println(job);
		System.out.println(Sal);
	}



public static void main(String[] args) {
	Employee a=new Employee(1010,"Sejal","Manager",29000);
	a.showData();
	
	Employee b=new Employee(2020,"minal","tester",50000);
	b.showData();
}
}

