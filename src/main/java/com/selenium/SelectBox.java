package com.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBox {
	
	WebDriver driver;
	
	@Test
	public void selectBoxFromDropdown() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button' and text() = 'Create new account']")).click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select select = new Select(day);
		select.selectByValue("20");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		select = new Select(month);
		select.selectByIndex(6);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		select = new Select(year);
		select.selectByVisibleText("2021");
		
		
		
	}

}
