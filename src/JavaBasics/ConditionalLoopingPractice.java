package JavaBasics;

public class ConditionalLoopingPractice {
public static void main(String[] args) {
	
//1.if user age is greater than or equal to 18 then user is allowed to open facebook account.

	//	int age=5;
	
//	if (age>=18)
//	{
//		System.out.println("the user is allowed to open facebook account");
//		
//	}else
//	{
//		System.out.println("the user is not allowed to open facebook account");
//	}

	
	
//     //2.if user age is greater than or equals to 18 and user is with indian nationality,then user is allowed to open the facebook account.
	
//	int age =25;
	
//	String Nationality="Austrellian";
	
//	//(and==>if both condition true T&&F==F)
//	
//	if(age>=15 && Nationality=="Indian")
//	{
//		System.out.println("the user is allowed to open facebbok account");
//	}else
//	{
//		System.out.println("the user is not allowed to open facebook account");
//	}
	
	
//	//3.to check even and odd number
//	(//%remainder==0 your number is even)	
	
//	int num =39;
	
//	if (num%2==0)
//	{
//		System.out.println("the number is even");
//	}else
//	{
//		System.out.println("the number is odd");
//	
//	}
//	
//	//4.to find out largest of two numbers.
	
//	int a=65;
//	int b=35;
//	if(a>b)
//	{
//		System.out.println("A is larger");
//	}else
//	{
//		System.out.println("B is larger");
//
//	}
	
	//5.to check number is positive/negative/zero
//	 
//	int Num=-10;
//	if(Num>0) {
//		System.out.println("the number is positive");
//	}else if(Num<0) {
//	
//		System.out.println("the number is negative");
//		
//	}else {
//	
//		System.out.println("the number is zero");
//	
//	}
//
//
//6.String comparison
	//java ==>the language is easy  difficult
	
//	String Language="java";
//	
//	if(Language=="java")
//	{
//		System.out.println("it is easy language");
//	}else {
//		System.out.println("the language is difficult");
//	}
	

	
	//7.to check day of the week
	
//	int day=50;
//	
//	if(day==1) {
//		System.out.println("Monday");
//	}else if(day==2) {
//		System.out.println("tuesday");
//	}else if(day==3) {
//		System.out.println("wednesday");
//	}else if(day==4) {
//		System.out.println("thursday");
//	}else if(day==5) {
//		System.out.println("friday");
//	}else if(day==6) {
//		System.out.println("saturday");
//	}else if(day==7) {
//		System.out.println("sunday");
//	}else {
//		System.out.println("wrong input selected");
//	}
//	
	//alternative to nested if else
	int day=20;
	switch(day) {
	case 1:
		System.out.println("Monday");break;
	case 2:
		System.out.println("tuesday");break;
	
case 3:
	System.out.println("wensday");break;

case 4:
	System.out.println("thursday");break;
case 5:
	System.out.println("friday");break;
case 6:
	System.out.println("saturday");break;

case 7 :
	System.out.println("sunday");break;

	default:System.out.println("wrong input selected");
	}
	

} 

    
    
}
