package dropDownHandeling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateFrimDropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//url of single select dropdown
		driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9WebElements/Single%20select%20dropdown.html");
		
		// identify dropdown and store it in one ref variable
		WebElement menuDropDown = driver.findElement(By.id("idddd"));
		
		//get all the options from menu dropdown
		Select sel = new Select(menuDropDown);
		List<WebElement> allOps = sel.getOptions();
		
		// to eliminate duplicates we use HashSet
	   HashSet<String>	hs=new HashSet<String>();
		
		
	}

}
