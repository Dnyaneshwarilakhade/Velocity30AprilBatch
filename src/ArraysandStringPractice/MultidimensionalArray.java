package ArraysandStringPractice;

public class MultidimensionalArray {
	
public static void main(String[] args) {
	
	int a[][]=new int[3][2];
	
	a[0][0]=100;
	a[0][1]=200;
	
	a[1][0]=300;
	a[1][1]=400;

	a[2][0]=500;
	a[2][1]=600;
	
	System.out.println("the no of rows :"+a.length);
	System.out.println("the no of columns:"+a[2].length);
	
	//how to read the values.(rows and columns)(outer==>rows,inner==>colns)
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}

}
}
