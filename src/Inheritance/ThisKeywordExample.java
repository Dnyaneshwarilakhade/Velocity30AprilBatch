package Inheritance;

public class ThisKeywordExample {

	
	//variable declaration
	int a;
	int b;
	
	//variable initialization==>obj/method/constructor
	
	
	//initialize ==>2==>4 variable==>a,b
	
	public void getvalues(int a,int b) {
		this.a=a;                        //we cannot differentiate local variable and global variable to refer global variable of same class we use this keywordd
	    this.b=b;
	}
	public void print() {   //variable usage
		System.out.println(a);   //25
		System.out.println(b);    //25
		
	}
	public static void main(String[] args) {
		ThisKeywordExample tk=new ThisKeywordExample();
		tk.getvalues(10,25);
		tk.print();
	}
	
}
