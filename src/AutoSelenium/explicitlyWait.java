package AutoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlyWait {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		//explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		WebElement textbx = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='Search for products, brands and more']")));
		textbx.sendKeys("nano");
		textbx.getAttribute("name");		
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']"))).click();
		
		
//		WebElement logbtn = driver.findElement(By.xpath("//a[text()='Login']"));
//		wait.until(ExpectedConditions.elementToBeClickable(logbtn));
//		logbtn.click();
		
		}

}
