package StringConcept;

public class PalindromeString {
	public static void main(String[] args) {
		
		String ORN="madam";
		String Reverse="";
		
		for(int i=ORN.length()-1;i>=0;i--) {
			Reverse=Reverse+ORN.charAt(i);
		}
		System.out.println(Reverse);
		
		System.out.println();
		if(ORN.equals(Reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
	}

}
