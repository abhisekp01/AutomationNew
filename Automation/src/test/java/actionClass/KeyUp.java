package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class KeyUp {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
	    
		
		Actions ac = new Actions(driver);
		
		
	   // WebElement link = driver.findElement(By.linkText("compendiumdev"));
	    
	    ac.scrollByAmount(100, 330);
	    
	   // ac.moveToElement(link).keyDown(Keys.CONTROL).click().release();
	}

}
