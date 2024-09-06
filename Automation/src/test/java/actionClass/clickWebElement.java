package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class clickWebElement {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Actions ac = new Actions(driver);
		
		ac.click(driver.findElement(By.name("email")));
		
		Action action = ac.build();
		action.perform();
	}

}
