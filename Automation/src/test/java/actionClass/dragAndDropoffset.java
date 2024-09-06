
package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class dragAndDropoffset {
	
	public static void main(String[] args) {
		
		
WebDriver driver=new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		Actions builder = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));
		
		int xoffset = from.getLocation().getX();
		int yoffset = from.getLocation().getY();
		
		System.out.println("xoffset--->\"+xoffset+\" yoffset--->\"+yoffset");
		
		//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
		
		xoffset =(xoffset-xoffset)+100;
		yoffset=(yoffset-yoffset)+200;
		
		builder.dragAndDropBy(from, xoffset, yoffset).perform();
	}

}
