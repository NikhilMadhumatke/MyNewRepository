package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.Generic_Utilities.WebDriver_Utility;

public class testing {

	public static void main(String[] args) {
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Alert a = driver.switchTo().alert();
		
		//a.accept(); 

		a.dismiss();
		
		//driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")).click();
		

	}

}
