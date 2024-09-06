import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class webelement {
	
	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://theautomationzone.blogspot.com");
		
		 WebElement text = driver.findElement(By.className("title"));
		
		 String s = text.getText();
		 
		
		System.out.println(s);
		
		
	}
	
		
	}

