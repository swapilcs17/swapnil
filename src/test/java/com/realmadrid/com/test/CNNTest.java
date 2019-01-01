package com.realmadrid.com.test;
import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CNNTest {

	
	@Test
	public void cnnTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tinu_Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://CNN.com");
		driver.quit();
	}
	
	@Test
	public void fbTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tinu_Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.quit();
	}
	

}
