package Exception;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CheckedException {
	public static void main(String[] args) {
		
		//we will write risky code in try block
		
//		try {
//			Thread.sleep(1000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("checked are automatically thown after main method means at the time of compilation");
//		}
//	
	//2.
		try {
			FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
			String username = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
