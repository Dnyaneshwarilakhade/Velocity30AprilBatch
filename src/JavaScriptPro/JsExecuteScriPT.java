package JavaScriptPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecuteScriPT {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    //1.Click the element
//	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	    
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	    
//	    
//	    WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//	    driver.switchTo().frame(frame1);
//	    
//	    WebElement TryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	    JavascriptExecutor js=((JavascriptExecutor)driver);
//	    js.executeScript("arguments[0].click();",TryitBtn);
//	    
	    
	    //2.title of the webpage
//	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	    
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	    JavascriptExecutor js=((JavascriptExecutor)driver);
//	    String Title = js.executeScript("return document.title;").toString();
//	    System.out.println(Title);
	    
	    
	    //4.generate an alert
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		Thread.sleep(1000);
//		js.executeScript("alert("+"website lauched successfully"+")");
		
		//5.refresh
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(2500);
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    js.executeScript("history.go(0)");
		
	}

}
