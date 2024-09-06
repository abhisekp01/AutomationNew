import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
	    driver.findElement(By.id("name")).sendKeys("abhi");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select drop = new Select(driver.findElement(By.id("course")));
		
		drop.selectByVisibleText("Dot Net");
		
		driver.switchTo().defaultContent();
		
		
	}

}
