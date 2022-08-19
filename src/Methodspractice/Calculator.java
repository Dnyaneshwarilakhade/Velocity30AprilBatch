package Methodspractice;

public class Calculator {

	public int add(int x, int y) {
		return x+y;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int c,int d) {
		return c*d;
	}
	public int div(int p,int q) {
		return p/q;
	}
	public int rem(int e,int f) {
		return e%f;
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		
		 System.out.println(cal.add(50, 60));
		 System.out.println(cal.sub(10,50));
		 System.out.println(cal.mul(10,12));
		 System.out.println(cal.div(19,15));
		 System.out.println(cal.rem(15,3));
	}
}

