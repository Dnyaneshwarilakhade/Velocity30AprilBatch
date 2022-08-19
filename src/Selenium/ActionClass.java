package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		//hover to the element//move to the element
//		
//		driver.get("https://www.next.co.uk/");
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//		
//		List<WebElement> Links = driver.findElements(By.xpath("//ul[@id='snail-trail-container']/li/a"));
//		
//		
//		
//		//for(int i=0;i<Links.size();i++)
//			for(int i=0;i<10;i++) {
//				WebElement link = Links.get(i);
//				Actions action=new Actions(driver);
//				action.moveToElement(link).build().perform();
//				System.out.println(link.getText());
//				Thread.sleep(1000);
//				
//			}
			
			//2.how to handle resizable items
//		
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		Thread.sleep(1000);
//		Actions action=new Actions(driver);
//		action.dragAndDropBy(resizable ,75, 75).build().perform();
//		
		
		//3.Drag and Drop
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement  droppable= driver.findElement(By.xpath("//div[@id='droppable']"));
//		Thread.sleep(1000);
//		Actions action=new Actions(driver);
//		action.dragAndDrop(draggable, droppable).build().perform();
//		
		//4.Draggable
//		driver.get("https://jqueryui.com/draggable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		Thread.sleep(1000);
//		Actions action=new Actions(driver);
//		action.dragAndDropBy(draggable,150,150).build().perform();
//		
		
		//5.rightclick
//       driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//       driver.manage().window().maximize();
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	   WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//	   Actions action =new Actions(driver);
//	   action.contextClick(image).build().perform();;
//		
		//left click
//	   driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//		Actions action = new Actions(driver);
//		action.click(image).build().perform();
		
		// 7. Sendkeys() :- with the help of action class.
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id ='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id ='pass']"));
		Actions action=new Actions(driver);
		action.sendKeys(username,"SACHHIT").build().perform();
		action.sendKeys(password,"abc@123").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		driver.close();
		}

}
