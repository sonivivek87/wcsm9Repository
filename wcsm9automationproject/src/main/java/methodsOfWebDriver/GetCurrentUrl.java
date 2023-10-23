package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
  public static void main(String[] args) throws InterruptedException {
	// launch the chrome browser
			WebDriver driver=new ChromeDriver();
			
			// maximize the chrome browser
			driver.manage().window().maximize();
			
			// launch the webapplication with the help of get() method
			driver.get("https://www.amazon.in/");
			
			//stop execution for 2 sec
			Thread.sleep(2000);
			
			// to get the current url of webpage
			System.out.println(driver.getCurrentUrl());
			
			// get the title of current webpage
			System.out.println(driver.getTitle());
			
			//close the webpage
			driver.close();
}
}
