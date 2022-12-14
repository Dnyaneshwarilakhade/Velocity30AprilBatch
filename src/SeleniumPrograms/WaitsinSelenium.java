package SeleniumPrograms;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsinSelenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit wait==>95
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
		WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//create the object of select class
		Select s= new Select(days);
		s.selectByIndex(25);
		
		
		//explicit wait==>particular element ==>higher time span==>5 percent
		WebDriverWait wait = new WebDriverWait(driver,30);
		//1st approach
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']"))).click();
		
		//2nd approach
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(LoginBtn));
		LoginBtn.click();
		
		
		
	}

}
