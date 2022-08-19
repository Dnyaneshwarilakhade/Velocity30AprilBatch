package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//explicit wait
		
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		//1.approach
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		  
		
	}

}
