

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childPopup {
	public static void main(String[] args) throws InterruptedException{
		
		Set<String>windowID;
		Iterator<String>itr;
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	
	    driver.get("https://in.bookmyshow.com/explore/home/mumbai/");
	    
	    driver.manage().window().maximize();
	    
	  //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    //first window
	    windowID=driver.getWindowHandles(); //1
	    itr=windowID.iterator(); //iterator to first window
	    String parentID = itr.next();  //jump to first window
	    System.out.println(parentID);
	    driver.switchTo().window(parentID );
	    driver.findElement(By.xpath("//a[text()='Movies']")).click();;
	    
	    Thread.sleep(2500);
	    windowID=driver.getWindowHandles(); //1
	    itr=windowID.iterator(); //iterator to first window
	     itr.next();  //jump to first window
	     String childID=itr.next(); 
		  System.out.println(childID);
	    driver.switchTo().window(childID);
	    driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
	    
	    Thread.sleep(4000);
	    //second window
	    
	    windowID=driver.getWindowHandles(); //2 window id
	    itr=windowID.iterator(); //iterator to 2 window
	    itr.next(); //jump to first window
	   itr.next();  //jump to 2nd window
	   String child2 = itr.next();
	   System.out.println(child2);
	   
		driver.switchTo().window(child2);
	    System.out.println(driver.getCurrentUrl());
	   
	   driver.switchTo().window(parentID);
	   
	   //driver.close();   //close only current window
	  // driver.quit();
	   
	   
	
	}

}


