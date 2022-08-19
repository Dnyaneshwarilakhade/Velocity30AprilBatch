package AutoHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAuto {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement LoginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
		
		
		//sendkeys==>pass the data
		WebElement emailId = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailId.sendKeys("dnyaneshwari@123");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("duggu123");
		
		WebElement ForgotLink = driver.findElement(By.xpath("//span[text()='Forgot?']"));
		ForgotLink.click();
		
//		WebElement loginBn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		loginBn.click();
//		
//		WebElement createALink = driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"));
//		createALink.click();
//		
//		WebElement mobileNo = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		mobileNo.sendKeys("9767129866");
//		
//		WebElement continueBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		continueBtn.click();
//		
	//	WebElement emaId = driver.findElement(By.xpath("//label[@class='_1fqY3P']/span"));
	
	}

}
