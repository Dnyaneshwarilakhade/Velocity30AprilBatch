package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webElementCommand {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
    WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
	Email.sendKeys("abc");
	
	
//	WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
//	loginBtn.click();
	
	
	//explicit wait
	
   WebDriverWait wait=new WebDriverWait(driver,30);
  		
	WebElement signuplink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
	wait.until(ExpectedConditions.elementToBeClickable(signuplink));
	signuplink .click();
	
	
//	WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
//	System.out.println(emailId.isEnabled());
//	
//	
//	if(emailId.isEnabled()==true) {
//		emailId.sendKeys("abc@gmail.com");
//	}else
//	{
//		System.out.println("element is not interactable");
//	}
//	
//     WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
//     System.out.println(password.isDisplayed());
//     password.sendKeys("duggu");
//
//
////  WebElement createbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
////  createbtn.click();
//  
////  WebElement signuplink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
////  signuplink .click();
////  
////  WebElement femaleradio = driver.findElement(By.xpath("//input[@type='radio' and @id='u_0_4_NG']"));
////  System.out.println(femaleradio.isSelected());
//  
//  WebElement signuplink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//  System.out.println(signuplink.getText());
//  System.out.println(signuplink.getAttribute("title"));
//  signuplink.click();
////   List<WebElement> fooetrlinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkLi')]/li/a"));
//// System.out.println(fooetrlinks.size());
////  
//// for(int i=0;i<fooetrlinks.size();i++) {
//////	 String footerlink = fooetrlinks.get(i).getAttribute("href");
//////	System.out.println(footerlink);
////	 System.out.println(fooetrlinks.get(i).getText());
//// }
// 
//  Thread.sleep(2000);
// 
// WebElement birthday= driver.findElement(By.xpath("//select[@name='birthday_day']"));
//
// Select s=new Select(birthday);
// //s.selectByIndex(18);
//// s.selectByValue("19");
// s.selectByVisibleText("19");
// 
// WebElement birthyear= driver.findElement(By.xpath("//select[@name='birthday_year']"));
//
// Select s1=new Select(birthyear);
// //s.selectByIndex(18);
//// s.selectByValue("19");
// String YEAR1 = s1.getFirstSelectedOption().getText();
// System.out.println(YEAR1);
// 
// 
// System.out.println("=============");
// s1.selectByVisibleText("1994");
// List<WebElement> years = s1.getOptions();
// System.out.println(years.size());
// 
// for(int i=0;i<years.size();i++) {
//	String year = years.get(i).getText();
//	System.out.println(year);
// }
// 
// 
//    WebElement birthmonth= driver.findElement(By.xpath("//select[@name='birthday_month']"));
//
//    Select s2=new Select(birthmonth);
//    s2.selectByVisibleText("Jan");
//     
//    List<WebElement> months = s2.getOptions();
//    System.out.println(months.size());
//    
//    for(int i=0;i<months.size();i++) {
//    	String month = months.get(i).getText();
//    	System.out.println(month);
//    }
//    
//  

    
    
}
}
