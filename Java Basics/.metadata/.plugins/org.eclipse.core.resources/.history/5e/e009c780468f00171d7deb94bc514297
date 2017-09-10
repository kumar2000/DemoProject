/**
 * 
 */
package syncronizations;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author hp
 *
 */
public class ExplicitWait {
	
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch Google Home Page
		driver.get("https://www.google.com");
	

		//identify the Google Search Text Editor
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		//Click on Search Button
		driver.findElement(By.name("btnK")).click();
		
		//WebDriverWait wait=new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium - Web Browser Automation")));
			
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Selenium - Web Browser Automation")))).click();
		
		//driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();	
		
		driver.findElement(By.linkText("Projects")).click();
		System.out.println("done");
		
	}

}
