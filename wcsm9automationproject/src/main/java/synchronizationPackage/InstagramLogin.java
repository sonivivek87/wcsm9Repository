package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		// without using Thread.sleep(2000);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	/* apply implicit wait--- it works only for findElement() and findElements() method.
	 * it is global wait.
	 * write this method before get() method.
	 * it does not stop the execution of script.*/
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	
	//Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin12"); //identify username textbox
	
	driver.findElement(By.name("password")).sendKeys("admin456"); // identify password textbox
	
	driver.findElement(By.xpath("//div[text()='Log in']")).click(); //identify login button
	}

}
