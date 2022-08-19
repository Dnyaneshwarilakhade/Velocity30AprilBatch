package AutoHomeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		
         WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.next.co.uk/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement imgLink = driver.findElement(By.xpath("//*[@id=\"platform_modernisation_product_summary_U10876\"]/div/div[2]/h2/a"));
		Actions action=new Actions(driver);
		action.doubleClick(imgLink).perform();
		
		
		
		
		
		
		
		//WebElement helplink = driver.findElement(By.xpath("//span[text()='Help']"));
		//Actions action=new Actions(driver);
		//action.click(helplink).perform();  //left click
	//action.contextClick(helplink).perform();  //Right click
	
         
//     //  how to handle resizable items
// 		driver.get("https://jqueryui.com/resizable/");
// 		driver.manage().window().maximize();
// 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// 		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
// 		driver.switchTo().frame(frame);
// 		WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
// 		Thread.sleep(2000);
// 		Actions action=new Actions(driver);
// 		action.
}
}
