package NewPracticeFolder;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement serach=driver.findElement(By.id("twotabsearchtextbox"));
	    
	    Actions a=new Actions(driver);
	    a.contextClick(serach).perform();
	}

}
