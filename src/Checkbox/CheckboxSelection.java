package Checkbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelection {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//specify one checkbox
		WebElement ch1 = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		ch1.click();
		
		//specify multiple checkbox
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'check')]"));
		System.out.println(chkboxes.size());
		
		for(int i=1;i<chkboxes.size();i++) {
			chkboxes.get(i).click();
		}
	}
}
