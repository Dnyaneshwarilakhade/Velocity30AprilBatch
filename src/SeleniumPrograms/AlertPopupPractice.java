package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupPractice {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.switchTo().frame("iframeResult");
	
	WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
	tryitbtn.click();
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();  //click on ok button
	
	
	
	
	
	
	}

}
