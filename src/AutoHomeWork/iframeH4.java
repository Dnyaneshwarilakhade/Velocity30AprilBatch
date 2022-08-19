package AutoHomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeH4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		
		driver.switchTo().frame("iframeResult");
		
		 WebElement innerFrame = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		 driver.switchTo().frame(innerFrame);
		WebElement para = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		String para1 = para.getText();
		System.out.println(para1);
		
		 driver.switchTo().parentFrame();
		
	    driver.findElement(By.xpath("//a[text()='W3Schools.com']")).click();
         
		
	}

}
