package StringConcept;
	

public class Reversest {
public static void main(String[] args) {
	
	 String Original="rina";
	 String Reverse="";
	 
	 for(int i=Original.length()-1;i>=0;i--) {   //i=3==>0+a=a
		                                           //i=2==>a+n=an
		                                            //i=1==>an+i=ani
		                                            //i=0==>ani+r=anir
		 Reverse=Reverse + Original.charAt(i);
	 }
	 
	 System.out.println(Reverse);
	 
	 if(Original.equals(Reverse)) {
		 System.out.println("String is palindrome");
	 }else {
		 System.out.println("string is not a palindrome");
	 }
}
}
