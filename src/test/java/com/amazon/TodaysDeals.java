package com.amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TodaysDeals {
public static WebDriver driver;

@BeforeClass
public static void browserLaunch() {
	WebDriverManager.edgedriver().setup();
	EdgeOptions options = new EdgeOptions();
//	options.addArguments("start-maximized");
	 driver = new EdgeDriver(options);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");
}

//@Ignore
//@AfterClass
//public static void browserClose() {
//	driver.quit();
//}

@Before
public void beforeMethod() {
	System.out.println(" Before Method ");
}

@After
public void afterMethod() {
	System.out.println(" After Method ");
}
	
	@Test
	public void method2() {
		WebElement tDeals = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		Assert.assertTrue(tDeals.isDisplayed());
		tDeals.click();
	}
	
	@Test
	public void method3() {
		
		List<WebElement> offers = driver.findElements(By.xpath("//span[text()='Deal']/parent::span/parent::span/preceding-sibling::span/span"));
		for(WebElement offer : offers) {
			
			String offerPercentage = offer.getText();
			Assert.assertEquals("Upto 20 %", offerPercentage);
			System.out.println("Offer Percentage - "+offerPercentage);
		}
		
		
	}
}
