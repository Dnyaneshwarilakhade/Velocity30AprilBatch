package JavaScriptPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JsScroll {
	public static void main(String[] args) throws InterruptedException {
		
		
		//1.Scroll down
//		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
//		WebDriver driver= new ChromeDriver();
//		
//		
//		driver.get("https://formy-project.herokuapp.com/scroll");
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//	    JavascriptExecutor js=((JavascriptExecutor)driver);
//	    Thread.sleep(1000);
//	    js.executeScript("scroll(0,2500)");
		
		
		//2.Scroll up
//		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
//		WebDriver driver= new ChromeDriver();
//		
//		
//		driver.get("https://formy-project.herokuapp.com/scroll");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//	    JavascriptExecutor js=((JavascriptExecutor)driver);
//	    Thread.sleep(1000);
//	    js.executeScript("scroll(0,2500)");
//	    Thread.sleep(1000);
//		js.executeScript("scroll(0,-500)");
		
		
		//3.Scroll into view
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    Thread.sleep(1000);
	   js.executeScript("arguments[0].scrollIntoView(true);",element);
		element.sendKeys("hello");
		
		
		
		
		
		
		
		
		
		
		
	}

}
