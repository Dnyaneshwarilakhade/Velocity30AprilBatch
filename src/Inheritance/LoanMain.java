package Inheritance;

public class LoanMain {

	public static void main(String[] args) {
		HLoan hl=new HLoan();
		hl.name("ABC PQR LMN");
		hl.age();
		hl.birthday();
		hl.birthmonth();
		hl.birthyear();
		hl.nationality();
		hl.mobileno();
		hl.adharcard();
		hl.pancard();
		hl.bankpassbook();
		hl.coapplicantname();
		
		hl.bunglow();
		hl.newflat();
		hl.oldflat();
		
		System.out.println("--------------");
		
		
		VLoan vl=new VLoan();
		vl.name("wxy pqr lmn");
		vl.age();
		vl.birthday();
		vl.birthmonth();
		vl.birthyear();
		vl.nationality();
		vl.mobileno();
		vl.adharcard();
		vl.pancard();
		vl.bankpassbook();
		vl.coapplicantname();
		
		vl.twowheeler();
		vl.threewheeler();
		vl.fourwheeler();
		
		System.out.println("--------------");
		
		
		Ploan pl=new Ploan();
		
		pl.name("LMN PQR STU");
		pl.age();
		pl.birthday();
		pl.birthmonth();
		pl.birthyear();
		pl.nationality();
		pl.mobileno();
		pl.adharcard();
		pl.pancard();
		pl.bankpassbook();
		pl.coapplicantname();
		
		pl.loanInterest();
		
		
	}
}
