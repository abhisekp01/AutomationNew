import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class getRect {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement rect = driver.findElement(By.id("email"));
		
		Rectangle s = rect.getRect();
		
		System.out.println(s.getX());
		System.out.println(s.getY());
		
		System.out.println(s.getWidth());
		System.out.println(s.getHeight());
		
	}

}
