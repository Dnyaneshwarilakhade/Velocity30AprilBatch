package Exception;

public class UncheckedException {
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("the progrem is started");
		
		
		//1.arithmetic exception unchecked exception
		
		try{
	         int a[]=new int[5];
	         a[3]=10/0;
	         a[6]=600;
	         System.out.println(a[6]);
	         System.out.println("First print statement in try block");
	      } catch(ArithmeticException e) {
	         System.out.println("Warning: ArithmeticException");
	      } catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("Warning: ArrayIndexOutOfBoundsException");
	      } catch(Exception e) {
	         System.out.println("Warning: Some Other exception");
	      }
	      System.out.println("Out of try-catch block");
	   

}
}
