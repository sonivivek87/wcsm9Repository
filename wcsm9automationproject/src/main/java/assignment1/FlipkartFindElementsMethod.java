package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementsMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();//handle popup
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");// identify search text box and enter laptop
	driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();// click on search icon
	driver.findElement(By.xpath("//div[text()='Brand']")).click();//click on brand
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();// select hp
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();//select core i7
	
	}

}
