package com.sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\Selenium Files\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("https://www.amazon.com");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrabhuPushpaKumar\\Downloads\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d2 = new ChromeDriver();
		d2.get("https://www.amazon.com");
				
	}

}
