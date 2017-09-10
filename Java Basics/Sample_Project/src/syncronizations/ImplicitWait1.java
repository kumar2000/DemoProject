package syncronizations;



import java.util.List;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 
{

	 public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PrabhuPushpaKumar\\Downloads\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	 
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		List<WebElement> var = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li/div/div[@class='sbqs_c']"));
		for(WebElement itr:var)
		{
			if(itr.getText().contains("selenium"))
			{
				itr.click();
				return;
			}
			
		}
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("btnK")).click();
	
		Thread.sleep(7000);
		
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	 }
}
