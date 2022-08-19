package constructor;

public class Demo1 {
 public static void main(String[] args) {
	
	 Demo d=new Demo();
	 d.test();  //zero argument
	 
	 System.out.println("-----------------------");
	 
	 Demo d1=new Demo(25,"hello"); //with argument 
	 d1.test();
	 
	 
}
}
