package constructor;

public class Demo {

	//variable declaration.
	int a;
	String str;
	
	//zero argument constructor
	
	Demo(){
		System.out.println("this is user defined zero argument constructor");
		//variable initialization
		a=10;
		str="30 april";
		
	}
	//with argument constructor
	Demo(int c,String d){
		System.out.println("this is with argument constructor");
		a=c;
		str=d;
	}
	
	public void test() {
		System.out.println(a);
		System.out.println(str);
	}
	
	
	
}
