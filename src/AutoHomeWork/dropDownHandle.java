package AutoHomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownHandle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s=new Select(year);
		s.selectByVisibleText("1994");
		
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println("total no of years:"+alloptions.size());
		
		for(int i=0;i<alloptions.size();i++) {
			String option=alloptions.get(i).getText();
			System.out.println(option);
			
		}
		
		
	}

}
