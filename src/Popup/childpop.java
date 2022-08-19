package Popup;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpop {
	public static void main(String[] args) {
		

	Set<String> windowsID;
	Iterator<String> itr;
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	//getWindowHandle
//	
//	String windowID=driver.getWindowHandle(); //return id of the single browser window
//	System.out.println(windowID);
	
	//getwindowHandles
	driver.findElement(By.xpath("//a[text()='Shipping']")).click(); //child window
	
	windowsID= driver.getWindowHandles();
	itr=windowsID.iterator();
	
	String firstid = itr.next();
	String secondid=itr.next();
	
	System.out.println(firstid);
	System.out.println(secondid);
	
	driver.switchTo().window(firstid);
	
	driver.switchTo().window(secondid);
	
	driver.findElement(By.xpath("//a[text()='Payments']")).click();
	
	windowsID= driver.getWindowHandles();
	itr=windowsID.iterator();
	itr.next();
	itr.next();
	String thirdid = itr.next();
	System.out.println(thirdid);
	 
	
	driver.switchTo().window(thirdid);
	
	
}
}
