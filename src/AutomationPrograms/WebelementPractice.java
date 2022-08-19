package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementPractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//1.sendkeys():-text field==>data pass
		
//		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
//		Username.sendKeys("Velocity 30th April");
//		
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@123456");
//		
//		//2.click()==>clicking==>button/radiobutton/checkbox/link
//		WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		LoginBtn.click();
//		
//		WebElement SignUpLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//		SignUpLink.click();
		
		//3.isEnabled==>state of the element
//		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
//		System.out.println(Username.isEnabled());
//		
//		if(Username.isEnabled()==true){
//			System.out.println("user name field is enabled");
//		}
//		else {
//			System.out.println("user name field is disabled");
//		}
//		//4.isDisplayed==>visualization of an element
//		
//		WebElement FBLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		System.out.println(FBLogo.isDisplayed());
//		
//		if(FBLogo.isDisplayed()==true) {
//			System.out.println("FB logo is Displayed");
//		}else {
//			System.out.println("FBlogo is not displayed");
//		}
//		
//		//5.isSelected==>checkbox and radiobutton
//		WebElement SignupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//		SignupLink.click();
//		//driver.findElement(By.linkText("Sign up"));
//		
//		WebElement WomenRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
//		WomenRadioBtn.click();
//		
//		if(WomenRadioBtn.isSelected()==true) {
//			System.out.println("women radio button is selcted");
//		}else {
//			System.out.println("women radio button is not selected");
//		}
		
		//gettext==>method will help you to extract the text component from the webelement
		
		//driver.findElement("//h2[text()='Facebook helps you connect and share with the people in your life.']");
		
		WebElement tagline = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps you')]"));
		
		String ActualString = tagline.getText();
		String ExpectedString="Facebook helps you connect and share with the people in your life.";
		
		if(ActualString.equals(ExpectedString)) {
			System.out.println("TestCase is Passed");
		}else {
			System.out.println("TestCase is failed");
		}
		
		
		//2.getetxt==>
		//driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		
		//get attribute==>method is used to get the attribute value of any element
		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println( Username.getAttribute("aria-label"));
		
		
		//driver.findElement(By.xpath(""));
	}

}
