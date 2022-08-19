package Generalization;

public class SimMain {
	public static void main(String[] args) {
		
		Airtel a=new Airtel();
		a.calling();
		a.sms();
		a.internet();
		
		
		System.out.println("====================");
		
		
		Jio j=new Jio();
		j.calling();
		j.sms();
		j.internet();
		j.amazonprime();
	}

}
