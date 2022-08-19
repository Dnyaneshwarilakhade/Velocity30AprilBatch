package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriv2 {
	public static void main(String[] args) {
		
		//launch the url
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//get url
		driver.get("https://www.facebook.com/");
		
//		//getcurrenturl
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		
//		//gettitle
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		//navigate
//		driver.navigate().to("https://www.flipkart.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
//		
		//maximize
		driver.manage().window().maximize();
		
		//setsize
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		
		//setposition
		Point p=new Point(50,100);
		driver.manage().window().setPosition(p);
		
		//close
		driver.close();
		
		//quit
		driver.quit();
	
	
	}

}
