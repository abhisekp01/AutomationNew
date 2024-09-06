import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class getLocation {
	
	public static void main(String[] args) {
		
	
	WebDriver driver=new SafariDriver();
	
	driver.get("https://www.facebook.com");
	
	WebElement size = driver.findElement(By.id("email"));
	
	Point s = size.getLocation();
	
	System.out.println(s);
	
	
	}

}
