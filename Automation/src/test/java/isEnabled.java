import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class isEnabled {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver= new SafariDriver();
		
		driver.get("https://www.facebook.com");
		
		boolean select = driver.findElement(By.name("login")).isEnabled();
		
		System.out.println(select);
	}

}
