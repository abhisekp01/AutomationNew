import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class autoSuggestionGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("vivo");
		
		Thread.sleep(3000);
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("///ul[@class='_1sFryS _2x2Mmc']/li"));
		
//		for (int i=0;i<listOfElements.size()-1;i++) {
//			
//			System.out.println(listOfElements.get(i).getText());
			
		
		
		for(int i=0;i< listOfElements.size();i++) {
			if(listOfElements.get(i).getText().equals("vivo v29")) {
				
				listOfElements.get(i).click();
		
		
			}
			
		}

	}

}
