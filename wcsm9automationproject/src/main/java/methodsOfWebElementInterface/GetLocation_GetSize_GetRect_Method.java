package methodsOfWebElementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect_Method {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://demoapps.qspiders.com/");
	
	// identify email text box
WebElement	emailTB = driver.findElement(By.cssSelector("input#email"));

// get Location of email text box

  int loc = emailTB.getLocation();
	
	}

}
