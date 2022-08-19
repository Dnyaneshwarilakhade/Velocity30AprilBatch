package Methodspractice;

public class MethodCasePractice {
 
	int x=20;
	int y=10;
	double d=200.5;
	
	//case 1:will not accept parameter and not return
	 
//	public void sum () {
//		System.out.println(x+y);
//	}
//	
	//case 2:will not accept parameter and will return anything
	
	public double sum() {
		return(x+d);
		}
//	
//	case 3:will accept parameter and not return anything
//	public void sum(int a,int b) {
//		System.out.println(a+b);
//	}
//	
//	case 4:method will accept parameter and return anything
//	public int sum(int a,int b) {
//		return a+b;
//	}
	
	 public static void main(String[] args) {
		 
////		 case 1
//		 MethodCasePractice mcp=new MethodCasePractice();
//		 mcp.sum();
//		 
//		 
////		 case2
		 MethodCasePractice mcp=new MethodCasePractice();
	    double z= mcp.sum();
		System.out.println(z);
		System.out.println(mcp.sum());
//		
//		
//		
////		 case 3
//		 MethodCasePractice mcp=new MethodCasePractice();
//		 mcp.sum(100,500);
//		 mcp.sum(10,50);
//		 
//		 
//		 
////		 case 4
//		 MethodCasePractice mcp=new MethodCasePractice();
//		int z= mcp.sum(100,500);
//			 System.out.println(mcp.sum(100,500));
	}
	
}

