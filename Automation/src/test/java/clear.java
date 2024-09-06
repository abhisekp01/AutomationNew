import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class clear {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.netflix.com/in/");
		
		WebElement clear = driver.findElement(By.name("email"));
		clear.sendKeys("abhisek");
		//clear.clear();
		
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(clear).keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).keyUp(Keys.CONTROL)
		.perform();
		

	}

}
