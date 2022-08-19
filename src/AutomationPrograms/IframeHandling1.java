package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//driver.switchTo().frame("iframeResult");
	
	WebElement ifa = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(ifa);
	 
	WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me!']"));
	clickMeBtn.click();
	
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	WebElement chngTheme = driver.findElement(By.xpath("//a[@title='Change Theme']"));
	chngTheme.click();
}
}
