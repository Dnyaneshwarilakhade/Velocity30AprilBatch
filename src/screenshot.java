import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		TakesScreenshot T=((TakesScreenshot)driver);
		T.getScreenshotAs(OutputType.FILE);
		
		
	}

}
