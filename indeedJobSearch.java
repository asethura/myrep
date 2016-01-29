package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeedJobSearch {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "c:\\Ashok\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.indeed.co.uk");
		driver.findElement(By.id("what")).sendKeys("Selenium");
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");
		driver.findElement(By.id("fj")).click();
		System.out.println(driver.toString());
	}
}
