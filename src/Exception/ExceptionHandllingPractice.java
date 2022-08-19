package Exception;

public class ExceptionHandllingPractice {
	public static void main(String[] args) {
		
		System.out.println("the program is started");
		
		//1.Arithmetic expression
		
//		int a=100;
//		System.out.println(100/0);
//		
		//2.Null pointer exception
		
//		String s=null;
//		System.out.println(s.length());
//		
		//number format exception
//		String s="abcdef";
//		int i=Integer.parseInt(s);
//		System.out.println(i);
//		
		
		//ArrayIndexOutOfBound
//		int a[]=new int[5];
//		
//		 a[10]=5000;
		 
		 //exception handling
		 
		 try {
			 int a=100;
				System.out.println(100/0);
	     }catch(Exception e1) {
	    	 e1.printStackTrace();
	    	 System.out.println("Exception captured by generic block");
	     }finally {
	    	 System.out.println("this is finally block executed with try as well as catch block ");
	     }
		 
		 //2nd risky code
		 try {
			 String s=null;
				System.out.println(s.length());
		 }catch(Exception e1) {
			 e1.printStackTrace();
			 System.out.println("exception captured by generic block ");
		 }finally {
			 System.out.println("this is finally block executed with try as well as catch block ");
		 }
		 System.out.println("the program is finished");
		 
	}

}
