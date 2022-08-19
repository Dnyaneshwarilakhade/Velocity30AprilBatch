package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttribue {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
	    
	    //capturing text from inputbox
	   System.out.println(emailid.getAttribute("placeholder"));
	   
	   
	  System.out.println(emailid.getText());
	  
	  WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
	  
	  System.out.println(login.getAttribute("name"));//name="login" //if value is present then use attribute
	  System.out.println(login.getAttribute("type"));
	  
	  System.out.println(login.getText()); ///inner text which is inside > log in <
	  
	  
	  WebElement heding = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
	  System.out.println(heding.getText());
	  
	
	
	
	
	}

}
