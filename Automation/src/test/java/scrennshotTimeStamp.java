import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.google.common.io.Files;

public class scrennshotTimeStamp {

	public static void main(String[] args) throws IOException {
		
WebDriver driver=new SafariDriver();
		
		driver.get("https://www.instagram.com");
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File("/Users/abhisekpatra/eclipse-workspace/Automation/Screenshot"+timestamp()+".jpg"));

		
		
		
	}

	private static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new java.util.Date());
	}

}
