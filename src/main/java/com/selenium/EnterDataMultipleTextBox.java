package com.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataMultipleTextBox {
	
	WebDriver driver;
	
	@Test
	public void EnterDMTBox() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button' and text() = 'Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test one");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test two");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");
	}

}
