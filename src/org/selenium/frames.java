package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println(frames.size());
		//switch into the frame
		driver.switchTo().frame("login_page");
		 driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("surya");
		//txtuser.sendKeys("surya");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
