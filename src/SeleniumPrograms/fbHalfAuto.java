package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbHalfAuto {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Signuplink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		Signuplink.click();
		
		//1.sendkeys==>data pass
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Sachhit");
		
		WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("Kalne");
		
		WebElement MobNo = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MobNo.sendKeys("9767129866");
		
		WebElement NewPswd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		NewPswd.sendKeys("duggu123");
		
		
		WebElement Signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		Signup .click();
		
		//isSeleced==>checkbox and radiobutton
		WebElement FERadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
		FERadioBtn.click();
		
		if(FERadioBtn.isSelected()==true) {
			System.out.println("female radio button is selceted");
		}else {
			System.out.println("female radio button is not selected");
		}
		
//		WebElement Tagline = driver.findElement(By.xpath("//div[text()='Create a new account']"));
//		
//		String ActualString=Tagline.getText();
//		String ExpectedString="Create a new account";
		
		
		
//	WebElement Tagline = driver.findElement(By.xpath("//div[text()='Create a new account']"));
//		
		String ActualString=driver.getCurrentUrl();
		String ExpectedString="https://www.facebook.com/reg/";
		
		if(ActualString.equals(ExpectedString)) {
			System.out.println("testCase is Passed");
		}else {
			System.out.println("testCase is failed");
		}
		
		
		
		
		
		
	}
	

}
