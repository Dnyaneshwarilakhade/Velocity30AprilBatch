package constructor;

public class StudentMain {
public static void main(String[] args) {
	
	//approach one:initialization by using object
//	
   Student s=new Student();  //object creation
	s.rollno=101;
	s.name="ABC";
	s.grade='A';
	s.display();
	
//  system.out.println("--------------------");
	
	//approach two:initialization by using method
	
//	Student s1=new Student();  //jvm==>default constructor
//	s1.getStudentDetails(201, "LMN",'B');   //initialization
//	s1.display();
//	
	//approach 3:constructor :initialization by using constructor
	
//	Student s2=new Student(301,"PQR",'C');
//	s2.display();
	
	
	
	
	
	
}
}
