package AutoHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statusOfWebelement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	   //isDisplayed() 
	   WebElement userid = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(userid.isDisplayed());
		
		//isEnabled()
		WebElement pswd = driver.findElement(By.xpath("//input[@name='pass']"));
		System.out.println(pswd.isEnabled());
		
		
		WebElement signupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		signupLink.click();
		
		//isSelected
		WebElement feMRdio = driver.findElement(By.xpath("//input[@value='1']"));
		System.out.println(feMRdio.isSelected());
		feMRdio.click();
		
		
		
		
		
		
		
	}

}
