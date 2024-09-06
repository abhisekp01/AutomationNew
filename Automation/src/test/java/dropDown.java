import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	
	public static void main(String[] args) {
		
	
	WebDriver driver=new SafariDriver();
	
	driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
	
	WebElement products = driver.findElement(By.id("Form_getForm_Country"));
	
	Select productDropdown=new Select(products);
	
	//productDropdown.selectByValue("Argentina");
	
	
	//productDropdown.selectByVisibleText("India");
	//productDropdown.selectByIndex(7);
	
	//productDropdown.selectByIndex(5);
	
	
	
	List<WebElement> alloptions = productDropdown.getOptions();
	
	for(WebElement option:alloptions) {
		
		if(option.getText().equals("Afghanistan ")){
			
		option.click();
			break;
			
			
			
		}}
	}}
