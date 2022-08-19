package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drive3 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String title=driver.getTitle();
	System.out.println(title);
	
	
	//navigate
		driver.navigate().to("https://in.bookmyshow.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	
	//maximize
	driver.manage().window().maximize();
	
	//minimize ==setsize
	Dimension d=new Dimension(100,200);
	driver.manage().window().setSize(d);
	
	//position
	Point p=new Point(100,50);
	driver.manage().window().setPosition(p);
	
	driver.quit();
	driver.close();
	
	
	
	
	
	
	
	}

}
