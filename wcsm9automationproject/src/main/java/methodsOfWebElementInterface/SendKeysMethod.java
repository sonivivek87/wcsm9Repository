package methodsOfWebElementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-obr7k03/login.do");
	//driver.findElement(By.name("username")).sendKeys("admin");
	//also write an different way
WebElement usnTB = driver.findElement(By.name("username"));
usnTB.sendKeys("admin");

	//driver.findElement(By.name("pwd")).sendKeys("admin123");
 WebElement	pswTB = driver.findElement(By.name("pwd"));

 pswTB.sendKeys("admin123");
	

	
	}

}
