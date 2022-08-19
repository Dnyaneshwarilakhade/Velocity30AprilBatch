package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		Thread.sleep(2000);     //for pause oe gap between two actions 2ms
		
		WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		//crate the object of select class 
		Select s=new Select(days);
		
		//1.select by index.(0-->n-1)
		s.selectByIndex(25);
		
		//2.select by value
		s.selectByValue("26");
		
		//3.select by visible text
		s.selectByVisibleText("26");
		
		
		//if you want to check all options
		List<WebElement> listofday = s.getOptions();
		
		System.out.println("total no of days available:"+listofday.size());
		
		for(int i=0;i<listofday.size();i++) {
		
			String day=listofday.get(i).getText();
	
			System.out.println(day);
		}
		
		System.out.println("===========================");
		WebElement years = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select s1=new Select(years);
		s1.selectByVisibleText("1985");
		
		//if you want to check all the options inside the list
		List<WebElement> listofyrs = s1.getOptions();
		
		System.out.println("total number of years available "+listofyrs.size());
		
		for(int i=0;i<listofyrs.size();i++)
		{		
	 String year = listofyrs.get(i).getText();
	 System.out.println(year);
	}
		System.out.println("================");
		
		//if you want to check default selected value
		String firstoptn=s1.getFirstSelectedOption().getText();
		System.out.println(firstoptn);
		
		WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//object
		Select s2=new Select(months);
		
		s2.selectByVisibleText("May");
		
		//if you want to check all the options inside the list
		List<WebElement> listofmonths = s2.getOptions();
		System.out.println("total no of months:"+listofmonths.size());
		
		for(int i=0;i<listofmonths.size();i++) {
			
		String month=listofmonths.get(i).getText();
		System.out.println(month);
		}
			
	}
}
