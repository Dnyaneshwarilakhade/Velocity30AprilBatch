package AutoHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//Basic locators  ctrl+F==>search
		driver.get("https://www.facebook.com/");
		
		//id
		//==>"email"
		driver.findElement(By.id("email"));
		
		//name
		//==>"name"
		driver.findElement(By.name("email"));
		
		//3.linked text
		//==>"Forgotten password?"
		driver.findElement(By.linkText("Forgotten password?"));
		
		//4.partial link text
		//==>"password"
		driver.findElement(By.partialLinkText("password?"));
		
		//5.classname
		//==>inputtext _55r1 _6luy
		driver.findElement(By.className("inputtext _55r1 _6luy"));
		
		//6.tagname
		//==>button
		driver.findElement(By.tagName("button"));
		
		
		
	}

}
