package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronize {
	
	public static void main(String[] args) throws InterruptedException{
		
	WebDriver driver=new ChromeDriver(); //launch the browser and upcast to WebDriver interface
	driver.manage().window().maximize();
	
	/* apply implicit wait--- it works only for findElement() and findElements() method.
	 * it is global wait.
	 * write this method before get() method.
	 * it does not stop the execution of script.*/
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.flipkart.com/"); // launch web application
	
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	driver.findElement(By.xpath("//a[text()='Cart']")).click(); // click on cart
	
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Login']")).click(); // click on login button
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9575372486"); // Enter mobile number
	
	driver.findElement(By.xpath("//button[text()='Request OTP']")).click(); // click on request otp
	
	
	}

}
