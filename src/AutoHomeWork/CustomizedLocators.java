package AutoHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocators {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    //customized locators
	    
	    //Customized Xpath
	    
	    //1.basic xpath
	    //2.text()
	    //3.contains
	    //4.starts-with
	    //5.logical operators
	    
	    //1.basic xpath
	    //tagname[@attribute='value']
	    
	    driver.findElement(By.xpath("//input[@name='email']"));
	    
	    //2. text>< in the link
	    //tagname[text()="value"]
	    
	   driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	   
	   //contains
	   driver.findElement(By.xpath("//input[contains(@id,'u_0_b_aY')]"));
	   
	   //starts- with
	   driver.findElement(By.xpath("//input[starts-with(@id,'u_0_')]"));
	   
	   
	    
	    
	    
	
	
	}

}
