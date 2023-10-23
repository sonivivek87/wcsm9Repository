package javamock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://desktop-obr7k03/login.do");
    driver.findElement(By.name("username")).sendKeys("manager");
    driver.findElement(By.name("pwd")).sendKeys("admin");
    driver.findElement(By.id("loginButton")).click();
	}

}
