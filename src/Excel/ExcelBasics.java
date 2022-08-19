package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasics {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
		
		String username = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(username);
		
	}

}