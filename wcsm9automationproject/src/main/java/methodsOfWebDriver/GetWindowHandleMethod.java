package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
				WebDriver driver=new ChromeDriver();
				
				// maximize the chrome browser
				driver.manage().window().maximize();
				
				// launch the webapplication with the help of get() method
				driver.get("https://www.amazon.in/");
				
				//stop execution for 2 sec
				Thread.sleep(2000);
				
				// get the address/handle of current window/browser
				// parent browser means the browser/window which has control
				
				String parenthandle = driver.getWindowHandle();
				System.out.println(parenthandle);
				
				//close the webpage
				driver.close();
	}

}
