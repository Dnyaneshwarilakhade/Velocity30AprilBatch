package Methodspractice;

public class MethodCase {

	 int x=10;
	int y=20;
	double d=30.0;
	
	
	//case 1:method will not accept the parameter and will not return anything
	 public void sum() {
		 System.out.println(x+y);
	 }
	 
	 //case 2:method will not accept parameter and will return anything
	  public double sum1() {
		  return x+d;
	  }
	  //case3:method will accept parameter but wil not return anything
	  
	  public void sum2(int a,int b) {
		  System.out.println(a+b);
	  }
	 //case4:method will accept parameter and return anything
	  public int sum3(int a,int b) {
		  return a+b;
	  }
	  
	 public static void main(String[] args) {
		MethodCase mj=new MethodCase();
		
		//case1
		mj.sum();
		
		//case2
		 double z=mj.sum1();
		 System.out.println(z);
		 System.out.println(mj.sum1());
		 
		 //case3
		 mj.sum2(100,200);
	
		 //case4
		 
		// int p=mj.sum3(40,50);
		// System.out.println(p);
		 System.out.println(mj.sum3(40,50));
	}
} 
