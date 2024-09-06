import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class scroll {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		
		jse.executeScript("window.scrollTo(0,500)");
		
		//jse.executeScript("window.scrollTo(0,-500)");
		
	}

}
