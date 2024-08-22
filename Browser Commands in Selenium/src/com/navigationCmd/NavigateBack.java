package com.navigationCmd;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://login.yahoo.com/");
	 url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.navigate().back();
		url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();

	}

}
