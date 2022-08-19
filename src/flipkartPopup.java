

		import java.util.Iterator;
		import java.util.Set;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class flipkartPopup {
			public static void main(String[] args) throws InterruptedException {
				
				Set<String>winds;
				Iterator<String>itr;
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
			    WebDriver driver=new ChromeDriver();
			
			    driver.get("https://www.flipkart.com/");
			    
			    driver.manage().window().maximize();
			    
			    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    
			    //first window
			    winds=driver.getWindowHandles(); //1
			    itr=winds.iterator(); //iterator to first window
			    String firstwindowid = itr.next();  //jump to first window
			    System.out.println(firstwindowid);
			    
			    WebElement fbpaylink = driver.findElement(By.xpath("//a[text()='Google Pixel 6A']"));
			    fbpaylink.click();
			    
			   // Thread.sleep(4000);
			    //second window
			    
			    winds=driver.getWindowHandles(); //2 window id
			    itr=winds.iterator(); //iterator to 2 window
			    
			    //itr.next(); //jump to first window
			   String secondwindowid = itr.next();  //jump to 2nd window
			   System.out.println(secondwindowid );
			   
			   Thread.sleep(2500);
			   driver.switchTo().window(secondwindowid);
			   //Thread.sleep(2500);
			   WebElement privacypolicyopt = driver.findElement(By.xpath("//a[text()='Payments']"));
			   privacypolicyopt.click();
			   
			   Thread.sleep(4000);
			   
			   //third window
			   winds=driver.getWindowHandles(); //3 windows id
			   itr=winds.iterator();   //iterate to 3rd window
			   itr.next();  //first window
			  // itr.next();  //second window
			   String thirdwindid = itr.next();  //third window
			   System.out.println(thirdwindid);
			   
			   driver.switchTo().window(thirdwindid);
			   System.out.println(driver.getCurrentUrl());
			   
			   driver.switchTo().window(firstwindowid);
			   
			   //driver.close();   //close only current window
			  // driver.quit();
			   
			   
			
			}

		

	}


