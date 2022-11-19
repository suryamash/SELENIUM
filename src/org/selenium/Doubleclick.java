package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Actions:c 
//            double click()-->m

public class Doubleclick {	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement lnkemail = driver.findElement(By.id("email"));
		lnkemail.sendKeys("welcome");
		Actions actions = new Actions(driver);
		actions.doubleClick(lnkemail).perform();
	}
	
	

}
