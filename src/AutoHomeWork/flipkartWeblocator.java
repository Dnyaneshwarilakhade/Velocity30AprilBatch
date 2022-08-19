package AutoHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartWeblocator {
  public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  
	  //name
	  driver.findElement(By.xpath("//input[@name='q']"));
	  
	 //text
	  driver.findElement(By.xpath("//div[text()='Under399 +Extra5% Off']"));
	  
//==>	//a[text()='Login']
	  
	  
	  driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	  
	  driver.findElement(By.xpath("//img[@alt='Deodorants']"));
	  
	  
}
}
