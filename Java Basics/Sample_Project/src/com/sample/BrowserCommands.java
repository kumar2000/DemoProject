package com.sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		//c1.get("https://www.amazon.in");
		
		c1.navigate().to("https://www.amazon.in");

		c1.manage().window().maximize();
		c1.manage().deleteAllCookies();
		c1.navigate().back();
		Thread.sleep(5000);
		c1.navigate().forward();
		Thread.sleep(5000);
		c1.navigate().refresh();
		
		String title = c1.getTitle();
		System.out.println(title);
		
		String url = c1.getCurrentUrl();
		System.out.println(url);
		
		//c1.close();
		c1.quit();
	}

}
