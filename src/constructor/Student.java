package constructor;

public class Student {

	//variable declaration
	
	int rollno;
	String name;
	char grade;
	
//	Student(int rn,String nm,char c){
//		
//		//user defined with argument
//		rollno=rn;
//		name=nm;
//		grade=c;
//	}
	
	public void getStudentDetails(int rn,String nm,char c) {
		rollno=rn;
		name=nm;
		grade=c;
	}
//	
	//method==>logic==>printing the variable values
	
	public void display() {
		//variable usage
		System.out.println("the student roll no is:"+rollno);
		System.out.println("the student name is:"+name);
		System.out.println("the student grade is:"+grade);
	}
	
}
