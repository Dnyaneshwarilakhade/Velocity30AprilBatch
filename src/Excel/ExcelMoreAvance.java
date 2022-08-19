
package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMoreAvance {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file; //declaration only once==>local
	
	file=new FileInputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\30AprilBatch.xlsx");
	int rowno=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	
	System.out.println("total no of rows:"+rowno);
	
	file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
	
	int cols=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	
	System.out.println("total no of columns :"+cols);
	
	for(int i=0;i<=rowno;i++) {
		for(int j=0;j<cols;j++) {
			file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
			String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			
			System.out.print(data+" ");
		}
		System.out.println();
	}
	
}
}
