package AutoHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logicalLocator {
	public static void main(String[] args) {
		
		//xpathby logical operator
		//and
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//and
		driver.findElement(By.xpath("//input[@type='text'and@name='firstname']"));
		
	//or
		driver.findElement(By.xpath("//input[@type='text'or@name='firstname']"));
		driver.findElement(By.xpath("//input[@id='u_0_b_XJ'or@name='firstname']"));
		
		
		
	}

}
