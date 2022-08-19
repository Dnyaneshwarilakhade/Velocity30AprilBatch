package AutoSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenShot2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
	   
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,50);
		
		WebElement movilink = driver.findElement(By.xpath("//a[text()='Movies']"));
		wait.until(ExpectedConditions.elementToBeClickable(movilink));
		movilink.click();
		
		Thread.sleep(5000);
		
	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Admin\\Desktop\\imagaeFolder\\f6.jpg");
		FileUtils.copyFile(source, destination);
		
	}

}
