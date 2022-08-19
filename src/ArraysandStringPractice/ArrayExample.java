package ArraysandStringPractice;

public class ArrayExample {
	public static void main(String[] args) {
		
		//1.how to declare the array.
		int a[]=new int[5];
		
		//2.how to add the values inside the array.(0 and ending at n-1)

		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//3.how many elements are present inside the array./size of an array
		
		System.out.println(a.length);
		System.out.println(a[2]);
		
		//to read the array/iterate over an array.
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
