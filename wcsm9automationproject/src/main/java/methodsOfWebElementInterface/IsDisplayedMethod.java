package methodsOfWebElementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-obr7k03/login.do");
		// identify username text box and paa admin
	driver.findElement(By.name("username")).sendKeys("admin");
	// identify username text box and pass manager
	driver.findElement(By.id("pwd")).sendKeys("manager");
	// identify login button and click
	driver.findElement(By.id("loginbutton")).click();
	
	// identify logout link`
	
		
	}

}
