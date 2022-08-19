package mock;

public class ReverseArray {
	public static void main(String[] args) {
		
		
//	char a[]= {'R','I','N','A'};
//	
//	for(int i=3;i>=0;i--) {
//		System.out.print(a[i]);
//	}
	
	
		
		String a[]=new String[7];
		a[0]="RINA";
		a[1]="";
		
		for(int i=a[0].length()-1;i>=0;i--) {
			a[1]=a[1]+a[0].charAt(i);
		}
		System.out.println(a[1]);
	}

}
