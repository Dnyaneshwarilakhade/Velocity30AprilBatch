package AutoHomeWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PractiseLoc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		//basic
		//1.IRCTC
		
		//1.id
		
		driver.findElement(By.id("passBooking"));
		
		//2.name
		driver.findElement(By.name("passBooking"));
		
		//3.linked text
		driver.findElement(By.linkText(" Click here"));
		
		//4.partial link text
		driver.findElement(By.partialLinkText("here"));
		
		//5.classname
		driver.findElement(By.className("form-control input-box ng-pristine ng-valid ng-touched"));
		
		//6.Tagname
		driver.findElement(By.tagName("button"));
		
		
		//customized locator
		//customized xpaths
		//1.id
		driver.findElement(By.xpath("//input[@id='passBooking']"));
		
		driver.findElement(By.xpath("//input[@name='passBooking']"));
		
		driver.findElement(By.xpath("//a[text()='IRCTC EXCLUSIVE']"));
		
		driver.findElement(By.xpath("//input[contains[@id='714297']"));
		
		driver.findElement(By.xpath("//input[starts-with[@id='714297']"));
		
		//xpath by logical operator
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='User Name']"));
		driver.findElement(By.xpath("//input[@id='7012424' or @formcontrolname='userid']"));
		
		//locators by css selector
		//1.tag#id
		driver.findElement(By.cssSelector("input#passBooking"));
		
		//2.tag.class
		driver.findElement(By.cssSelector("input.form-control input-box ng-pristine ng-valid ng-touched"));
		
		//3.tag[attribute=value]
		driver.findElement(By.cssSelector("input[formcontrolname=userid]"));
		
		//18.tag,class,attribute==>tagname.classname[attribute=value]
		driver.findElement(By.cssSelector("input.css-checkbox ng-untouched ng-pristine ng-valid[name=otpLogin]"));
		
		
	}

}

