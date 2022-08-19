package ArraysandStringPractice;

public class StringOperations {

	public static void main(String[] args) {
		
		String s="Velocitye";  //index 0 to n-1
		String s1="   i am leaving in pune ";
		
		//1 length
		System.out.println(s.length());
		//2.uppercase
		System.out.println(s.toUpperCase());
		//3.lowercase
		System.out.println(s.toLowerCase());
		//4.charat()
		System.out.println(s.charAt(3));
		//5.indexof()
		System.out.println(s.indexOf("e"));//1st apperance
		//6.lastindexof()
		System.out.println(s.lastIndexOf("e"));
	
		System.out.println(s1);
		//7.trim()
		System.out.println(s1.trim());
	}
}
