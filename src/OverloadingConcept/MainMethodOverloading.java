package OverloadingConcept;

public class MainMethodOverloading {

	public void main(int x) {  //regular method
		System.out.println(x);  //single value
	}
	
	public static void main(int x,int y) {  //regular method
		System.out.println(x+y);  //addition of two numbers
	}
	
	public static void main(int x,int y,int z) {  //regular method
		System.out.println(x+y+z);  //additon of three numbers
	}
	
	
	public static void main(String[] args) { //execution of main method predifned to jvm because of parameter string[]args
		//execution of all method
		
		main(25,25);
		main(25,25,25);
		
		MainMethodOverloading mo=new MainMethodOverloading();
		mo.main(36);
		
	}
}
