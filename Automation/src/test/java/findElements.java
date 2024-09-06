
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class findElements {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.irctcbuddhisttrain.com");
		
		List<WebElement> elements = driver.findElements(By.xpath("//button"));
		
		for (WebElement element : elements) {
			
			System.out.println(element.getText());
			
		}

	}

}
