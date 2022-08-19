package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.switchTo().frame("frame1");
		WebElement para1 = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		System.out.println(para1.isDisplayed());
		System.out.println(para1.getAttribute("id"));
		System.out.println(para1.getText());
		
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame2");
		WebElement para2 = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		System.out.println(para2.isDisplayed());
		System.out.println(para2.getAttribute("id"));
		System.out.println(para2.getText());
		
	}

}
