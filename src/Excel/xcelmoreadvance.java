package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xcelmoreadvance {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file;
		
	     file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
		int rownm = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();	
		
		System.out.println("no of rows"+rownm);
	
		 file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
	     int colnm=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	     System.out.println("no of columns:"+colnm);
	     
	     for(int i=0;i<rownm;i++) {
	    	 for(int j=0;j<colnm;j++) {
	    		 file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
	    		 String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
	    		 System.out.print(data+"==>");
	    	 }
	    	 System.out.println();
	     }
	
	}

}
