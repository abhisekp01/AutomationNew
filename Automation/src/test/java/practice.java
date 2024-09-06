import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class practice {
	
public static void main(String[]simran) {

	WebDriver driver=new SafariDriver(); 
	
	driver.get("https://www.saucedemo.com/v1/");
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	
	
	System.out.println(url);
	
	//String pagesource = driver.getPageSource();
	
	//System.out.println(pagesource);
	
	String window = driver.getWindowHandle();
	System.out.println(window);
	

	
}

}