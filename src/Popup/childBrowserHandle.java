package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserHandle {
	public static void main(String[] args) {
		
		Set<String> windowsID;
		Iterator<String> itr;
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//getWindowHandle
		
		String windowID=driver.getWindowHandle(); //return id of the single browser window
		System.out.println(windowID);
		
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); //child window
		
		
		 windowsID = driver.getWindowHandles();
		 itr=windowsID.iterator();
		
		String parentID = itr.next();
		String childID = itr.next();
		
		System.out.println(parentID);
		System.out.println(childID);
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()=' Privacy Policy']")).click();//2nd child
		
		 windowsID = driver.getWindowHandles();
		 itr=windowsID.iterator();
		 
		 String parentID1 = itr.next();
			String childID1= itr.next();
			String childID2 = itr.next();
		System.out.println( childID2);
		driver.switchTo().window(childID2);
		System.out.println(driver.getTitle());
	}

}
