package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptExecuterJava {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("http://www.greenstech.in/selenium-course-content.html");
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		WebElement top = driver.findElement(By.xpath("//h2[contains(text(),'Top')]"));
		jk.executeScript("arguments[0].scrollIntoView(true)",top);
		Thread.sleep(3000);
		
		WebElement bottom = driver.findElement(By.xpath("//h3[contains(text(),'One')]"));
		jk.executeScript("arguments[0].scrollIntoView(false)",bottom);*/
		
		
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement userid = driver.findElement(By.id("email"));
		//userid.sendKeys("surya123");
		jk.executeScript("arguments[0].setAttribute('value','surya@gmail.com')",userid);
		
		
		Object object = jk.executeScript("return arguments[0].getAttribute('value')",userid );
		String txt = (String)object;
		System.out.println(txt);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()",btnlogin );
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
