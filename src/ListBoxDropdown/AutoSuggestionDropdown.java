package ListBoxDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement drpDwn = driver.findElement(By.xpath("//input[@name='q']"));
		drpDwn.click();
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		System.out.println(suggestions.size());
		
		for(int i=0;i<suggestions.size();i++) {
			 WebElement suggest = suggestions.get(i);
			
			if(suggest.getText().contains("thermax")) {
				suggest.click();
				break;
			}
		}
		
	}

}
