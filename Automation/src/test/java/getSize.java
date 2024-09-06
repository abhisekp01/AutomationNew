import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class getSize {
	
	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement size = driver.findElement(By.id("email"));
		
		
		Dimension s = size.getSize();
		
		System.out.println(s);
	}

}
