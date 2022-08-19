package SeleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelAdvance {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		for(int i=0;i<10;i++) {
//			
//			FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\30AprilBatch.xlsx");
//			
//			String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
//			
//			System.out.println(value);	
//		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(int i=0;i<7;i++) {
			FileInputStream file=new FileInputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\30AprilBatch.xlsx");
			String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			al.add(value);
		}
		
		for(int j=0;j<al.size();j++) {
			driver.get(al.get(j));
			System.out.println(driver.getTitle());
		}
		
		
	}

}
