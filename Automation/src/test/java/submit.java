import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class submit {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("abhi");
		
		WebElement submit = driver.findElement(By.name("login"));
		
		submit.submit();

	}

}
