package ArraysandStringPractice;

public class ReverseString {
public static void main(String[] args) {
	
	String original="madam";
	String reverse="";
	
	for(int i=original.length()-1;i>=0;i--) {
		reverse=reverse+original.charAt(i);
	}
	System.out.println(reverse);
	
	//palindrome string
	
	
	if(original.equals(reverse)) {
		System.out.println("string is palindrome");
	}else {
		System.out.println("string  is not palindrome");
	}
}
}
