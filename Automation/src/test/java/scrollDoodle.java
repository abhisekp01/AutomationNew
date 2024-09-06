import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class scrollDoodle {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/search?client=safari&sca_esv=588967138&channel=mac_bm&sxsrf=AM9HkKkh044l6mqi0foQRFgmbUTGe0phcA:1702017448409&q=google+doodles+images&tbm=isch&source=univ&fir=X_E_EuNwfVT_xM%252Ca_U-UxhH5CqoyM%252C_%253B4Sr1Jdc6c6ixnM%252CevqT4_n68C7hzM%252C_%253Bad302Wu2rg9ZvM%252C0TKbRBPP06qLEM%252C_%253Bdt6HGCtYQTyaoM%252CXimTd-XYChsjnM%252C_%253Bi8eTErqGuUQaFM%252CVZlu8bkrOcy6jM%252C_%253Buh-QB_BHwhMZTM%252C4zYk6rDlG8tt8M%252C_%253BqD37YZfcm7FeMM%252CRI4oI3Ss-S7gLM%252C_%253Bz-MLXirac02cKM%252COeCgzjK6tDQeoM%252C_%253BZyBjj6ABFSawiM%252CxL1rLxqneGLMVM%252C_%253BY5ltAR90wA3Q4M%252C-5TnT7njsOAU2M%252C_&usg=AI4_"
				+ "-kT_OO6P8xJ4bf6OXJxZiqkGlQPy-g&biw=1440&bih=764&dpr=2");
		
        JavascriptExecutor jse = (JavascriptExecutor)driver; 
        
        
		//ScrollTo
        
		//jse.executeScript("window.scrollTo(0,1500)");
		
		//jse.executeScript("window.scrollTo(0,3000)");
        
        //ScrollBy
        
        jse.executeScript("window.scrollBy(0,1500)");
        
        jse.executeScript("window.scrollBy(0,5500)");

	}

}
