package webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//1.how to find rows tr
		 int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		 System.out.println("rows:"+rows);
		 
		 //2.how many columns th
		 int cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
		 System.out.println("columns:"+cols);
		 
		 
//		 String value = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText();
//		 System.out.println(value);
		 
//		 //retrive all data from the table
		 
		 for(int r=2;r<=rows;r++) {
			 for(int c=2;c<=cols;c++) {
				 String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
				 System.out.print(data+"==>");
			 }
			 System.out.println();
		 }
	}
}
		 
	


