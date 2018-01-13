

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazoneTest {

	 static WebDriver driver;
	 
@Test
public void amazon() throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:/Users/Vikas/Desktop/TrainingMaterial/Framework/Lib/geckodriver.exe");
		 driver =new FirefoxDriver();
		 driver.get("https://www.amazon.com/");
		 
		 driver.manage().window().maximize();	
		 
		 WebElement selectmenu= driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		 
		 Select select=new Select(selectmenu);
		 select.selectByVisibleText("Baby");
		 
		 driver.navigate().refresh();
		 
		 Thread.sleep(4000);
		 
		/* //Mouse over
		 WebElement account=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"));
		 Actions action = new Actions(driver);
		 action.moveToElement(account).build().perform();
		 
		 driver.navigate().back();*/
		
		 driver.close();
	}

}
