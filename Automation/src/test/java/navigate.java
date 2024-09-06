import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class navigate {
	
	
	public static void main(String[] args) {
		
		WebDriver driver= new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.redbus.in");
	
		
		
	}

}
