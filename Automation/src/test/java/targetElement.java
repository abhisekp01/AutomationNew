import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class targetElement {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.amazon.in");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollTo(0,1500)");
		
		
	    WebElement amazon = driver.findElement(By.xpath("//img[@alt='SDM HANDICRAFT Wall Shelves for Living Room Stylish Wooden,Wall Mounted Book Shelf,"
	    		+ "Wall Shelf for Photos, Decorations,...']"));
		
	    
	   amazon.click();		

				
			
	}
}
