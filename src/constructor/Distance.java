package constructor;

 public class Distance {
	 int F;
     int I;
 
	
	Distance(int f,int i){
		F=f;
		I=i;
		
	}
	public void showData() {
		System.out.println(F+"feets"+I+"inches");
	}
	

		
	public static void main(String[] args) {
		
	{
				Distance a=new Distance(2,9);
				a.showData();
				Distance b=new Distance(5,2);
				b.showData();
				
			}
		
		}
 }
 
