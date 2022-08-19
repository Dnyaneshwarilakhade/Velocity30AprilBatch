package mock;

public class palin {
	public static void main(String[] args) {
		
		String Or="madam";
		String rev="";
		
		
		
		for(int i=Or.length()-1;i>=0;i--) {
			
			rev=rev+Or.charAt(i);
			
		}
	
		System.out.println(rev);
	
		
		if(Or.equals(rev)) {
			System.out.println("string is palindrome");
		}else
		{
			System.out.println("string is not palin");
		}
			
		}
	

}
