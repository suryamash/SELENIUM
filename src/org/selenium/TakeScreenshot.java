package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement lnkemail = driver.findElement(By.id("email"));
		lnkemail.sendKeys("welcome");
		Actions actions = new Actions(driver);
		actions.doubleClick(lnkemail).perform();
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		System.out.println(screenshotAs);
//		File file = new File("C:\\Users\\surya\\screenshot.png");
//		FileUtils.copyFile(screenshotAs,file );
		
	//	driver.quit();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File file = new File("C:\\\\Users\\\\surya\\screenshotas.png");
		FileUtils.copyFile(screenshotAs,file );
		
	}

}
