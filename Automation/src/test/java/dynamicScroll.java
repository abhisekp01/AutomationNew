import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class dynamicScroll {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.google.co.in/search?client=safari&sca_esv=e1cf12f9f09085f6&channel=mac_bm&q=google+doodle&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiQ6sCP95aEAxVdSWwGHZnxBK8Q0pQJegQIDBAB&biw=1425&bih=736&dpr=2");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeAsyncScript("window.scrollTo(0,5000)");
		
		//jse.executeAsyncScript("window.scrollTo(0,-3000)");
	}

}
