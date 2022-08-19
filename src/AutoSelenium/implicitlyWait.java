package AutoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Will enable 5 seconds']"));
		btn.click();
		
		
		WebElement clrchng = driver.findElement(By.xpath("//button[text()='Color Change']"));
		clrchng.click();
	}

}
