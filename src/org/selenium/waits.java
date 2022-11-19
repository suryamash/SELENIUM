package org.selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
//		driver.findElement(By.name("firstname")).sendKeys("surya");
//		driver.findElement(By.name("lastname")).sendKeys("ps");
		
		//fluent wait
		FluentWait w1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("surya");
		driver.findElement(By.name("lastname")).sendKeys("ps");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
