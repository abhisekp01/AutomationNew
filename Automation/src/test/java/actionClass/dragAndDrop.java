package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.interactions.Actions;


public class dragAndDrop {
	
	public static void main(String[] args) {
		
		
        WebDriver driver=new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		Actions builder = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));
		
		builder.dragAndDrop(from, to).perform();
		
	}

}
