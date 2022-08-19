package ProgermAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethod {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(links.size());
		
		
		for(int i=0;i<links.size();i++) {
			String link = links.get(i).getText();
			System.out.println(link);
		}
		
		
	}

}
