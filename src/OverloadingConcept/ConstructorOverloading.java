package OverloadingConcept;

public class ConstructorOverloading {

	ConstructorOverloading(){
		System.out.println("this is zero argument consteuctor");
	}
	
	
	ConstructorOverloading(int a){
		System.out.println("this is one argument consteuctor");
	}
	
	ConstructorOverloading(int a,int b){
		System.out.println("this is two argument consteuctor");
	}
	
	ConstructorOverloading(double a,double b){
		System.out.println("this is two double argument consteuctor");
	}
	
	ConstructorOverloading(float a,float b){
		System.out.println("this is two float argument consteuctor");
	}
	
	ConstructorOverloading(String a,String b){
		System.out.println("this is two String argument consteuctor");
	}
	
	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading(25,50);
		ConstructorOverloading co1=new ConstructorOverloading();
		ConstructorOverloading co2=new ConstructorOverloading(25);
		ConstructorOverloading co3=new ConstructorOverloading(25.5,50.5);
		ConstructorOverloading co4=new ConstructorOverloading ("hii","hello");
	}
}
