package JavaBasics;

public class Pattern4 {
public static void main(String[] args) {
	
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	
//	for(int i=1;i<=4;i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	
	
	for (int i=5;i<=1;i--) {
		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		} // This for loop is to print spaces
		for (int k=1;k<=i;k++) {
			System.out.print(i+" ");
		} // This for loop is to print Number
		System.out.println();
}
}
}



//*
//**
//***
//****
//*****
//****
//***
//**
//*
