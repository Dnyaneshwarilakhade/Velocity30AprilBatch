import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//span[contains(@class,'fl icon-cale')]")).click();;
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[text()='>']")).click();
	
	List<WebElement> days = driver.findElements(By.xpath("//tr//th"));
	System.out.println(days.size());
	
	for(int i=0;i<days.size();i++) {
	 String day = days.get(i).getText();
	 System.out.println(day);
	}
	
}
}
