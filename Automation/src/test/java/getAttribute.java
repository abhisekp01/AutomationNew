import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class getAttribute {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://theautomationzone.blogspot.com");
		
		WebElement getAttr = driver.findElement(By.className("title"));
		
		String s = getAttr.getAttribute("class");
		
		System.out.println(s);
		
	}

}
