import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class isDisplayed {
	
	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		System.out.println(driver.findElement(By.name("websubmit")).isDisplayed());
		
	}
	

}
