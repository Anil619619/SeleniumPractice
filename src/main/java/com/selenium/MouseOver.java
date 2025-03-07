package com.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
WebDriver driver;
	
	@Test
	public void selectBoxFromDropdown() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement mouseOver = driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mouseOver).build().perform();
	}

}
