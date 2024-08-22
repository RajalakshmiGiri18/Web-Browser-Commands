package com.navigationCmd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNavigation {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.javatpoint.com/testng-tutorial");
		driver.manage().window().maximize();
	

}
}
