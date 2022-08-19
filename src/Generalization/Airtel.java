package Generalization;

public class Airtel implements Sim{

	@Override
	public void internet() {
		System.out.println("1 GB/day");
	}

	@Override
	public void calling() {
		System.out.println("calling unlimited");
	}

	@Override
	public void sms() {
		System.out.println("20 sms/day");
	}

}
