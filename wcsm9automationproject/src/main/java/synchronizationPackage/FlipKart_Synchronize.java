package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Synchronize {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.flipkart.com/");// launch web application
	driver.findElement(By.xpath("//span[text()='✕']")).click();// handle the popup
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");// search iphone in search textfield
	driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click(); //click on search icon
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click(); //click on second option
	driver.findElement(By.xpath("//*[@id=\"swatch-2-color\"]/a/div")).click();// chose the green colour // right click and chose copy the x-path
	driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw']")).click();// click/select 256gb
	driver.findElement(By.id("//input[@id='pincodeInputId']")).sendKeys("411057");// identified delivery textbox
	
	
	}

}
