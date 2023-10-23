package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackSynchronize {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//launch chrome browser and upcasted to WebDriver interface
	driver.manage().window().maximize();
	/* apply implicit wait--- it works only for findElement() and findElements() method.
	 * it is global wait.
	 * write this method before get() method.
	 * it does not stop the execution of script.*/
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.shoppersstack.com/"); //launch webApplication
	driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']")).click();// click on samsung
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("488011");//pass the value into check-delivery textbox
	//Thread.sleep(2000); // with this statement script is working but we have to avoid it.
	driver.findElement(By.xpath("//button[@id='Check' and (@name='Check')]")).click();//click on check
	}

}
