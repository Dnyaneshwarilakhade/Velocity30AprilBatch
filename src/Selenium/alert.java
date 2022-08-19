package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println( al.getText());
		al.accept();
		
	}

}
