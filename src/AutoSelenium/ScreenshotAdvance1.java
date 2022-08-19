package AutoSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAdvance1 {
	public static WebDriver driver;
	
	
	public static void getScreenshot() throws IOException{
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String filename = d.toString().replace(" ","_").replace(":","_")+".png";
		
		File destination=new File("C:\\Users\\Admin\\Desktop\\imagaeFolder\\f6.jpg"+filename);
		FileUtils.copyFile(source, destination);
		
	}
	
	
public static void main(String[] args) throws IOException,InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
    
	 driver=new ChromeDriver();
	
	driver.get("https://in.bookmyshow.com/explore/home/mumbai");
   
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	getScreenshot();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Movies']")).click();
	Thread.sleep(3000);
	getScreenshot();
	
}
}
