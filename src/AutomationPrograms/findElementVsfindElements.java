package AutomationPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementVsfindElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//findelement
		WebElement userid = driver.findElement(By.xpath("//input[@name='email']"));
		userid.sendKeys("Sachhit");
		
		
		//In case of findElement if element is not present in dom then it will through exception NoSuchElement And
		//In case of findElements if element is not present then it will through zero,0 as an output
		
		//find element will locate single webelement
		
		//for list of webelement we use findElements list webelement
		
		List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']"));
		
		System.out.println(footerlinks.size());
		
		for(WebElement ele:footerlinks) {
			System.out.println(ele.getText());
		}
		
		List<WebElement> img = driver.findElements(By.xpath("//img[@alt='instagram']"));
		System.out.println(img.size());
	}

}
