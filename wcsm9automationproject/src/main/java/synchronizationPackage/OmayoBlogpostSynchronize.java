package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogpostSynchronize {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // apply implicit wait
	
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//button[text()='Dropdown']")).click(); // it is working with implicit wait.
	driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	}

}
