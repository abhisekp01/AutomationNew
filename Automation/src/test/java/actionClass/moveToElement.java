package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class moveToElement {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.tatamotors.com");
		
		Actions ac = new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//a[text()='Organisation']"));
		
		ac.moveToElement(hover).pause(Duration.ofMillis(3000)).build().perform();
		
		//ac.moveToElement(hover, 100, 200).build().perform();
	}

}
