package JavaScexecute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsByutility {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	    driver.manage().window().maximize();
//	   
//	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	   
//	   driver.switchTo().frame("iframeResult");
//	   
	   //1.drawing the border around webelement
//	  
//	 WebElement tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//	 utility.borderbyJS(driver, tryitbtn);
//	 //utility.getscreenshot(driver);
////	 JavascriptExecutor js=((JavascriptExecutor)driver);
////	 js.executeScript("arguments[0].style.border='3px solid red'",tryitbtn);
//	 Thread.sleep(2000);
//	 
//	 //2.Capture the title of webpage
//		
//	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	 System.out.println(utility.titlebyJS(driver));
//	 Thread.sleep(2000);
//	 
////	 JavascriptExecutor js=((JavascriptExecutor)driver);
////	 String Title = js.executeScript("return document.title;").toString();
////	 System.out.println(Title);
//	
//	 //click on particular element .click
//	 
//	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	 driver.switchTo().frame("iframeResult");
//	 
//	WebElement tryitbtn1 = driver.findElement(By.xpath("//button[text()='Try it']"));
////	
////	 JavascriptExecutor js=((JavascriptExecutor)driver);
////	  js.executeScript("arguments[0].click",tryitbtn);
//	 
//		 //click on particular element .click
////		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
////     	driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////		driver.switchTo().frame("iframeResult");
////		WebElement Tryitbtn = driver.findElement(By.xpath("//button[text()='Try it']"));
////		JavascriptExecutor js = ((JavascriptExecutor)driver);
////		js.executeScript("arguments[0].click();", Tryitbtn);
//	 utility.clickbyJS(driver, tryitbtn1);
//	 Thread.sleep(2000);
//		
//		
//		//generate an alert
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	 JavascriptExecutor js=((JavascriptExecutor)driver);
//	 js.executeScript("alert('"+"Website launched successfully"+"')");
	 utility.alertbyJS(driver, "Facebook page is launched");
	 Thread.sleep(2000);
	 
	 //refresh
	 driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)");
	 utility.refreshbyJS(driver);
	 utility.alertbyJS(driver, "The page is sucessfully refreshed");
	 Thread.sleep(200);
//6. Scrolling of the webpage.
		
		// scroll down.
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,2500)");
	 utility.scrolldownbyJS(driver, 0, 1000); 
	Thread.sleep(2000);
		//7.scroll up
	 
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,2500)");
//		Thread.sleep(2500);
//		js.executeScript("scroll(0,-500)");
	 utility.scrolldownbyJS(driver, 0, 1000); 
	 utility.scrollupbyJS(driver, 0, 500);
	 Thread.sleep(2000);
	 
		// scroll into view :- this will scroll upto the perticular webelement.
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
		utility.scrollintoviewbyJS(driver,element);
		utility.clickbyJS(driver,element);
		Thread.sleep(2000);
	  
	   
//	   JavascriptExecutor js=((JavascriptExecutor)driver);
//	   js.executeScript("alert("+"website launched sucessfully"+")");
//		
	}

}

