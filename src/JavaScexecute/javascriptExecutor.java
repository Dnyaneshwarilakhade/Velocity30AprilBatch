package JavaScexecute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	   driver.manage().window().maximize();
//	   
//	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	   
//	   driver.switchTo().frame("iframeResult");
//	   
//	   //1.drawing the border around webelement
//	  
//	 WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	
//	 JavascriptExecutor js=((JavascriptExecutor)driver);
//	 js.executeScript("arguments[0].style.border='3px solid red'",tryitbtn);
//	 
	 
	 //2.Capture the title of webpage
//		
//	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	 
//	 
//	 JavascriptExecutor js=((JavascriptExecutor)driver);
//	 String Title = js.executeScript("return document.title;").toString();
//	 System.out.println(Title);
	
	 //click on particular element .click
	 
//	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	 driver.switchTo().frame("iframeResult");
//	 
//	WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	
//	 JavascriptExecutor js=((JavascriptExecutor)driver);
//	  js.executeScript("arguments[0].click",tryitbtn);
	 
		 //click on particular element .click
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//     	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement Tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", Tryitbtn);
		
		
		
//		//generate an alert
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	 JavascriptExecutor js=((JavascriptExecutor)driver);
//	 js.executeScript("alert('"+"Website launched successfully"+"')");
//	 
	 //refresh
//	 driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2500);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)");
		
//6. Scrolling of the webpage.
		
		// scroll down.
		
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,2500)");
//	
		//7.scroll up
	 
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,2500)");
//		Thread.sleep(2500);
//		js.executeScript("scroll(0,-500)");
//	 
	 
		// scroll into view :- this will scroll upto the perticular webelement.
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	   
//	   JavascriptExecutor js=((JavascriptExecutor)driver);
//	   js.executeScript("alert("+"website launched sucessfully"+")");
//		
	}

}
