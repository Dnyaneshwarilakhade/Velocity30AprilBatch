package AutoHomeWork;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	
	public class LocatorsByCss {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			//css==>
			//tag and id==>tag#id
			
			driver.findElement(By.cssSelector("tag#id"));
			driver.findElement(By.cssSelector("input#email"));
			
			//tag and class
			//tag.class
			driver.findElement(By.cssSelector("tag.class"));
			driver.findElement(By.cssSelector("input.inputtext "));
			
			//tag and attribute
			//tagname[attribute name=value]
			driver.findElement(By.cssSelector("input[name=email]"));
			
			//tag class attribute
			//tagname.classname[attribute=value]
			driver.findElement(By.cssSelector("input.inputtext[name=email"));
			
			

}
	}
