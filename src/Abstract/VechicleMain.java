package Abstract;

public class VechicleMain {
	public static void main(String[] args) {
		
		Bus b=new Bus();
		System.out.println(b.getnumberofwheels());
		System.out.println(b.getnumberofperson());
		
		Car c=new Car();
		System.out.println(c.getnumberofwheels());
		System.out.println(c.getnumberofperson());
	}

}
