package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class clickAndHold {
	
	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testkru.com/Interactions/DragAndDrop");
		
		WebElement hold = driver.findElement(By.id("box1"));
		
		Actions ac = new Actions(driver);
		
		
		ac.clickAndHold(hold).build().perform();
		
	}

}
