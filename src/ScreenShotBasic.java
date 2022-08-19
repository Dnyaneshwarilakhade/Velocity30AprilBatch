import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotBasic {
public static void main(String[] args) throws IOException  {
	
	
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\Admin\\Desktop\\imagaeFolder\\facebook.jpg"));
			
			
			// multiple screen shot ==> file name not changed ==> screen shot ==> override.
			
			// every time i should be able to create a new screen shot with different name
			
			
			
			
			
		}
}

