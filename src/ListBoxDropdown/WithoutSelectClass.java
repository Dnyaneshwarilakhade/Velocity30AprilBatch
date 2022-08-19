package ListBoxDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectClass {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		 WebElement drpBtn = driver.findElement(By.xpath("//input[@id='fromCity']"));
		 drpBtn.click();
		
		 List<WebElement> options = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li//p"));
		 
		 System.out.println(options.size());
		 
		 Thread.sleep(1000);
		 
		 for(int i=0;i<options.size();i++) {
			 
			 WebElement option = options.get(i);
			
			 if(option.getText().equals("Pune, India")) {
				 
				 option.click();
				 break;
			 }
			 
		 }
		
	}

}
