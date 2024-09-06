import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class xpath {
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement cap = driver.findElement(By.id("email"));
		
		cap.sendKeys("abhi");
		//cap.sendKeys(Keys.CLEAR);
		//sendKeys("abhi".toUpperCase());
		
		Actions act = new Actions(driver);
		
		
	    
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
	   // String css = driver.findElement(By.id("email")).getCssValue("background-clip:");
	    	//	System.out.println(css);
	    
		//driver.findElement(By.id("email")).clear();
		
		//driver.findElement(By.name("login")).submit();
	}

}
