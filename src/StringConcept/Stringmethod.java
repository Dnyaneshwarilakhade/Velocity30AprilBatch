package StringConcept;

public class Stringmethod {
	public static void main(String[] args) {
		
	
	String s1="Velocity";
	String s2="VELOCITY";
	String s3="Veloc";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s1.contains(s3));
	System.out.println(s1.isEmpty());
	
	System.out.println(s1.concat(s3));
	System.out.println(s1.concat("abc"));
	
	String s4="ABC";
	String s5="XYZ" ;
	
	System.out.println(s4.startsWith("AB"));
	System.out.println(s5.endsWith("YZ"));
	
	
	String s6="hii this is divya lakhade";
	
	
	System.out.println(s6.replace("divya","nano"));
	 String s7=s6.replace("divya","nano");
	System.out.println(s7);
	
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(3,6));
	System.out.println(s1.substring(0,7));
	
	
	String words[]=s7.split(" ");
	System.out.println(words.length); //total no of strings present in sentence
	for(int i=0;i<words.length;i++) {
	System.out.print(words[i]);
	
	}

}

}