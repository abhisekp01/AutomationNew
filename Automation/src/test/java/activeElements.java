import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class activeElements {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement webElement = driver.switchTo().activeElement();
		
		webElement.sendKeys("Abhi",Keys.TAB,"abhi123",Keys.ENTER);

	}

}
