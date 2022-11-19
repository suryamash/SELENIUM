package org.selenium;
// Actions:C------------------------------->Robot class---Java package
//                                --------->Action class---Selenium package
//           1.KeyDown()--->m
//           2.KeyUp()---->m
//           3.SendKeys()-->m
//      press shift    : KeyDown()--->m
//      insert value   : KeyUp()---->m
//      Release shift  : SendKeys()-->m
// Keys : Enum
//                A
//                SHIFT
//                ENTER

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickRobotClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement Email = driver.findElement(By.id("twotabsearchtextbox"));
		Actions actions = new Actions(driver);
	//	Email.sendKeys("iphone",Keys.ENTER);
		Email.sendKeys(Keys.SHIFT,"iphone",Keys.ENTER);
		
	
		
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Email = driver.findElement(By.id("email"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(Email, "welcome").keyUp(Keys.SHIFT).perform();
		*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
