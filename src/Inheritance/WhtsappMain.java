package Inheritance;

public class WhtsappMain {
	public static void main(String[] args) {
		WhtsappV1 v1=new WhtsappV1();
		v1.textmsg();
		
		System.out.println("--------------");
		
		WhtsappV2 v2=new WhtsappV2();
		v2.textmsg();
		v2.audiocalling();
		
		
		System.out.println("---------------------");
		
		WhtsappV3 v3=new WhtsappV3();
		v3.textmsg();
		v3.audiocalling();
		v3.videocalling();
		
		System.out.println("-------------------");
		
		WhtsappV4 v4=new WhtsappV4();
		v4.textmsg();
		v4.audiocalling();
		v4.videocalling();
		v4.payments();
		}

}
