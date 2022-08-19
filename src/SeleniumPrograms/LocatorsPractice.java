package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\Admin\\Desktop\\version\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		
		
		//basic locators
		
		//1.id
		driver.findElement(By.id("provide the id value from the website"));
		driver.findElement(By.id("email"));
		
		//2.name
		driver.findElement(By.name("provide the name value from the website"));
		driver.findElement(By.name("email"));
		
		//3.Linked Text
		driver.findElement(By.linkText("provide the text from the website which written in ><symbol"));
		driver.findElement(By.linkText("Forgotten password?"));
		
		//4.Prtial link text
		driver.findElement(By.partialLinkText("provide the part of text from the website which written in >< symbol"));
		driver.findElement(By.partialLinkText("password?"));
		
		//5.Classname
		driver.findElement(By.className("provide the attribute value for the class atrribute from the website"));
		driver.findElement(By.className("inputtext _55r1 _6luy"));
		
		//6.Tagname
		driver.findElement(By.tagName("provide the tagname from the website"));
		driver.findElement(By.tagName("button"));
		
		//customized locator
		//7. Absolute xpath.
		driver.findElement(By.xpath("provide the absolute x path from the website"));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/h2"));
		
		//8. Relative xpath
		driver.findElement(By.xpath("provide the relative x path from the website"));
		driver.findElement(By.xpath("//*[@id='content']//h2"));
		
		//customized xpath
		//with regular expression
		//1.id
		driver.findElement(By.xpath("//tagname[@attribute name='value']"));
		driver.findElement(By.xpath("//input[@id='email']"));
		
		//2.text
		driver.findElement(By.xpath("//tagname[text()='value']"));
		driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//3.xpath by contains
		driver.findElement(By.xpath("//tagname[contains(@attribute,'value')]"));
		driver.findElements(By.xpath("//input[contains(@id,'u_0_b')]"));
		
		//12.xpath by starts-with
		driver.findElement(By.xpath("//tagname[starts-with(@attribute,'value')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0_b')]"));
		
		//13.xpath by logical operator ==>and
		driver.findElement(By.xpath("//tagname[@attribute1='value1' and @attribute2='value2']"));
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']"));
		
		//14.xpath by or ==>used for dynamic element ==>id dynamically changes when refresh and to show result 1 of 1 in search field
		
		driver.findElement(By.xpath("//tagname[@attribute1='value1'or @attribute2='value2']"));
		driver.findElement(By.xpath("//input[@id='u_0_b_eA'or@name='firstname']"));
		
		//locators by css selector
		//15.css==>tag and id==>tag#id
		driver.findElement(By.cssSelector("tag#id"));
		driver.findElement(By.cssSelector("input#email"));
		
		//16.tag and class==>tag.class
		driver.findElement(By.cssSelector("tag.class"));
		driver.findElement(By.cssSelector("input.inputtext"));
		
		//17.tag and attribute==>tag.[attribute='value']
		driver.findElement(By.cssSelector("input[name='email']"));
		
		
		//18.tag,class attribute==>tagname.classname[attribute='value']
		driver.findElement(By.cssSelector("input.inputtext[name='email']"));
		
		
		
		
		
	}
	

}
