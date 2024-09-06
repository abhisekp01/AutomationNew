import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class nestedFrame {
	
	public static void main(String[] args) {
		
WebDriver driver=new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement frame = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		frame.click();
		
		WebElement parentFrame = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
        driver.switchTo().frame(parentFrame);
        
        WebElement chidFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
        driver.switchTo().frame(chidFrame);
        
       // driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("simmi");
        
	}

}
