import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class popUps {

	public static void main(String[] args) {
		
		WebDriver driver= new SafariDriver();
		
		driver.get("https://www.ixigo.com");
		
		driver.switchTo().activeElement();
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
