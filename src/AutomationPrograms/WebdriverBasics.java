package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {
	public static void main(String[] args) {
		
		//1.to launch the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//2.launch the url==get
		driver.get("https://www.facebook.com/");
//		driver.get("https://www.next.co.uk/");
//		driver.get("https://www.flipkart.com/");
		
		//3.close the browser==>close
		//driver.close();
		
		//4.quit==>close the browser
		//driver.quit();
		
		//5.getcurrenturl()--browser currently which url hit
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		
//		
//		//6.gettitle()
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		
//		//7.maximize ==>this method will be used to maximize the browser
//		driver.manage().window().maximize();
//		
//		//8.navigate==get url hit
//		driver.navigate().to("https://www.facebook.com/");
//        driver.navigate().to("https://www.flipkart.com/");	
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        
//       // 9.set size ==>set size
//        Dimension d=new Dimension(150,300);
//        driver.manage().window().setSize(d);
//        
//        //10.setposition==>browser position
//        Point p=new Point(100,200);
//        driver.manage().window().setPosition(p);
        
        
        
		
		
		
		
	}

}
