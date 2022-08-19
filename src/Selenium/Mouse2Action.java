package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2Action {
	public static void main(String[] args) throws InterruptedException {
		
		
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
//					
//			         WebDriver driver=new ChromeDriver();
//					
//				//	driver.get("https://www.w3schools.com/js/js_htmldom_events.asp");
//			         
//			         driver.get("https://demoqa.com/dragabble");
//					
//					driver.manage().window().maximize();
//					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//					
//					
//					WebElement ClickMeBtn = driver.findElement(By.xpath("//div[text()='Click Me']"));
//					//Thread.sleep(2000);
//					Actions action=new Actions(driver);
//					//action.click(ClickMeBtn).perform();
//				//rightClick	action.contextClick(ClickMeBtn).perform();
					
					//hover to the element
//					WebElement mouseBtn = driver.findElement(By.xpath("//div[text()='Mouse Over Me']"));
//					Actions action=new Actions(driver);
//					action.moveToElement(mouseBtn).perform();
//					
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
//		
//        WebDriver driver=new ChromeDriver();
//	 
//        driver.get("https://demoqa.com/resizable");
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//							
//					
//					WebElement resizable = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']"));
//					Actions action=new Actions(driver);
//					action.dragAndDropBy(resizable,75,75).build().perform();
					
					//Draggable
//		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
//				
//		        WebDriver driver=new ChromeDriver();
//			 
//		        driver.get("https://demoqa.com/dragabble");
//				
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//				
//					WebElement draggable = driver.findElement(By.xpath("//div[@id='dragBox']"));
//					Actions action=new Actions(driver);
//					action.dragAndDropBy(draggable,150,150).build().perform();
//					
					//Drag and Drop
//					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
//					
//			        WebDriver driver=new ChromeDriver();
//				 
//			        driver.get("https://demoqa.com/droppable");
//					
//					driver.manage().window().maximize();
//					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
//						WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//						WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
//						Actions action=new Actions(driver);
//						action.dragAndDrop(draggable, dropable).build().perform();
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
//		
//        WebDriver driver=new ChromeDriver();
//	 
//        driver.get("https://www.facebook.com/");
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
//		Actions action=new Actions(driver);
//		//action.sendKeys(username, "nano").build().perform();
//		action.keyDown(username, Keys.SHIFT).sendKeys("paresh").keyUp(Keys.SHIFT).build().perform();;
//		
//		action.keyUp(Keys.SHIFT).build().perform();
//		action.sendKeys(password,"paresh123").build().perform();
//		
//		action.sendKeys(Keys.ENTER).build().perform();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
	 
        driver.get("https://www.next.co.uk/holiday-shop");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement footrLink = driver.findElement(By.xpath("//ul[@data-testid='footer-main-links-title-shopping-with-us-list']//li[6]//a"));
	   Actions action=new Actions(driver);
	   action.moveToElement(footrLink).doubleClick().build().perform();
	}

}
