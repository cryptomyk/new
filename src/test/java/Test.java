import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String args[]) throws InterruptedException {
		
			

		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\minbal521\\Documents\\Chrome driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			
				driver.get("https://google.com");
				System.out.println("In google.com");
				driver.findElement(By.name("q")).sendKeys("java");
				System.out.println("Entering java");
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				System.out.println("pressing enter key");
				Thread.sleep(2000);
				
				driver.quit();
				
		
			
		

		
	}
	
	
}
