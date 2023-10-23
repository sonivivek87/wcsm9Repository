package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();  // launch the browser
	
	driver.manage().window().maximize();   // maximize
	
	driver.get("https://www.google.com");  // launch the webApplication
	
	Thread.sleep(3000);                    // provided delay
	
	//switch the control to active element
	driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER); 
	// sendKeys()method belongs to WebElement interface
	}
}
	
