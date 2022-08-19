package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickbtn.click();
		
		//Thread.sleep(4000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//or
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//		driver.switchTo().alert().accept();
		
		
		WebElement clk2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clk2.click();
		
		WebElement clk3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clk3.click();
		
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		//alert1.dismiss();
		
		
		WebElement clk4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
	
		clk4.click();
		
		Thread.sleep(4000);
		
		Alert alertwindow=driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.sendKeys("Sachhit");
		alertwindow.accept();
	}

}
