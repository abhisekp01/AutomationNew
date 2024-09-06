package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class click {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		driver.get("https://www.instagram.com");
		
		driver.findElement(By.name("username")).sendKeys("abhi");
		
		driver.findElement(By.name("password")).sendKeys("abhi123");
		

		Actions ac = new Actions(driver); //insatance create
		
		driver.findElement(By.name("login"));
		
		ac.click();
		

	}

}
