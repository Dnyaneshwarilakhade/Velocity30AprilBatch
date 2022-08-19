package OverridingConcept;

public class HDFC extends RBI {

	
	public double RateOfInterest() {
		return 7;
	}
	
	public static void main(String[] args) {
		RBI r=new RBI();
		System.out.println(r.RateOfInterest());
	System.out.println(r.personalloaninterst());	
	
	
	
		SBI s=new SBI();
		System.out.println(s.RateOfInterest());
		System.out.println(s.personalloaninterst());
		
		
		HDFC h=new HDFC();
		System.out.println(h.RateOfInterest());
		System.out.println(h.personalloaninterst());
		
	}
}
