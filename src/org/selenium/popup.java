package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Alert:I------>window based popup------>does not able to inspect
//Alert ref = driver.switchTo().alert();

//Alert:Interface ---> 1.accept():m---->[click ok button}
//                    2.dismiss():m---->[click cancel button]
//                 	3.SendKeys():m--->[used to insert value in button]
//simple alert: which contains only ok button.
//confirm alert: which contains ok and cancel button.
//prompt alert: enter some value and then click ok and cancel button.

public class popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement lnkswitch = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkswitch).perform();
		Thread.sleep(2000);
		
		 WebElement AlertOk = driver.findElement(By.xpath("//a[text()='Alerts']"));
		 AlertOk.click();
		 WebElement btnsimple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 btnsimple.click();
		 org.openqa.selenium.Alert a = driver.switchTo().alert();
		 a.accept();
		 
		 Thread.sleep(2000);
		 WebElement AlertOkCancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		 AlertOkCancel.click();
		 WebElement btnConfirm = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		 btnConfirm.click();
		 org.openqa.selenium.Alert a1=driver.switchTo().alert();
		 a1.dismiss();
		 
		 Thread.sleep(2000);
		 WebElement EnterValue = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		 EnterValue.click();
		 WebElement btnvalue = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		 btnvalue.click();
		 org.openqa.selenium.Alert a2 = driver.switchTo().alert();
		 a2.sendKeys("surya");
		 a2.accept();
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}
