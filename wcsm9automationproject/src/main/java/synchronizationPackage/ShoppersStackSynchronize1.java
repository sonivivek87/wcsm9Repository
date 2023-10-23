package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStackSynchronize1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("488011");
	//click button takes time to get active. synchronization issue is occur
	//use explicit wait
	//Thread.sleep(2000); try to apply Explicit wait instead of Thread.sleep().
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']"))).click();// this statement can also be write in another way
	
	/*
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
	element.click();
	*/
	
	}

}