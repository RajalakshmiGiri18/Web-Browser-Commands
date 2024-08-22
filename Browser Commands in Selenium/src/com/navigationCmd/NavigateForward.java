package com.navigationCmd;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateForward {
	@Test
	public void NavigateFor() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromeDriverJars/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in");
	    driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://login.yahoo.com/");
		driver.navigate().back();
		url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.navigate().forward();
		url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.quit();
		
	}

}
