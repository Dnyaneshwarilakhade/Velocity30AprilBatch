package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver1 {
	public static void main(String[] args) {
		
		//to lauch the browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
//		//to launch the url
//	    driver.get("https://www.google.co.in/");
//	    driver.get("https://sbi.co.in/");
//		
//	    //current url
//	    
//	    String url=driver.getCurrentUrl();
//	    System.out.println(url);
//	    
//	    String title=driver.getTitle();
//	    System.out.println(title);
//		
	    //navigate
//	   driver.navigate().to("https://www.facebook.com/");
//	   driver.navigate().to("https://www.next.co.uk/");
//	   driver.navigate().back();
//	   driver.navigate().forward();
//	   driver.navigate().refresh();
//	   
	   //maximize
		driver.manage().window().maximize();
		
		//setsize
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		
		//position
		Point p=new Point(50,30);
		driver.manage().window().setPosition(p);
	   
	}

}
