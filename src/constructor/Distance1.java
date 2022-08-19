package constructor;

public class Distance1 {

	int Dist;
	int feet;
	
	
	Distance1(int d,int f){
		Dist=d;
		feet=f;
	}
	
//	 public void getValue(int d,int f) {
//		 Dist=d;
//		 feet=f;
//	 }
//	
	//usage
	public void display() {
		System.out.println("DISTANCE IS :"+Dist);
		System.out.println("Feet is:"+feet);
	}
}
