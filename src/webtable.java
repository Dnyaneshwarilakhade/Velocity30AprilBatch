import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
			System.out.println("The number of rows in the table are:- "+rows);
			
			 int cols = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td")).size();
			System.out.println("The Number of columns in the table are:- "+cols);
			
			
			for (int r=1; r<=rows; r++) {
				for (int c=1; c<=cols; c++) {
					String value = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr["+r+"]/td["+c+"]")).getText();
				    System.out.print(value+ "==>");
				}
				System.out.println();
			}
			
			
			
			
			
		}

	}


