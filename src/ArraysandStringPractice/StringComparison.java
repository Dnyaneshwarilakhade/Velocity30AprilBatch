package ArraysandStringPractice;

public class StringComparison {
	public static void main(String[] args) {
		String s1="Velocity";
		String s2="VELOCITY";
		String s3="Velco";
		
		//equals():-compare the two string.
		System.out.println(s1.equals(s2)); //boolean value//also check the case==>case sensitive method
		
		
		//equalsignorecase():-compare two string//case insensitive//validate content
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//contains():-compare if one string is a part of another string//case sensitive
		System.out.println(s1.contains(s3));
		
		//isempty():-will check given string is empty or not
		System.out.println(s1.isEmpty());
		
		//concats:-will use to add two strings(+ operators :-user message and program o/p)
		
		String s4="ABC";
		String s5="XYZ";
		System.out.println(s4.concat(s5));
		System.out.println(s4.concat("LMN"));
		
		//startswith:-will check any string starts with a particular pattern.
		System.out.println(s4.startsWith("AB")); //TRUE==FALSE
		
		//endswith:check any string end with a particular pattern
		System.out.println(s5.endsWith("YZ"));   //TRUE/FALSE
				
		
		//REPLACE:will replace part of the string by a new string or combination of characters
		
		String s6="This is java Automation Testing class";
		System.out.println(s6.replace("java","python")); //temporary operation==not permanant
		
		String s7=s6.replace("java","python");
		System.out.println(s7);
		System.out.println(s6.replace("Automation","Development"));
		
		//substring:extract the part/portion of the string based on index
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,6));
		
		
		//split():-to split ur given string based on specific pattern.
		String s8="This@java@Automation@Testing@class";
		String words[]=s8.split("@");
		System.out.println(words.length);
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
			}
		}
				
		

 		
		
			
		}


