package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import com.beust.jcommander.JCommander.Builder;

public class contextClick {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("http://omayo.blogspot.com");
		
		driver.manage().window().maximize();
				
		Actions ac = new Actions(driver);
		
		WebElement context = driver.findElement(By.name("q"));
		
		ac.contextClick(context).build().perform();	
		
	}

}
