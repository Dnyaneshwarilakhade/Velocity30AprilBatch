package Abstract;

public class Car extends Vechicle{


	public int getnumberofwheels() {
		
		return 4;
	}

	
	public int getnumberofperson() {
	
		return 5;
	}
	
	public int amountofinsurance() {
		int amt=getnumberofwheels()*getnumberofperson();
		return amt;
	}

	//car specific
}
