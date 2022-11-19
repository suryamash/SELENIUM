package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.Text--->method
//  //tagname[text()='textname']-------------->syntax

//2.Text.Contains---->method
//  //tagname[contains(text(),'partiallytext')]------>example for text contains method

//3.Attributevalue.contains---->method
//  //tagname[contains(@attributename,'partiallyattributevalue')]------->example for Attribute.contains method

//4.gettext()---->method
//  //span[text()='hello welcome']-------->just a example

//5.getattribute
//  //attributevalue=getattribute("attributename")

   //in text contains only four types 
        //1.text
        //2.contains-->text,attributevalue
        //3.gettext()
        //4.getattribute(" ")

public class Texttasks {
	public static void main(String[] args) throws InterruptedException {
		
		
		
//		DAY-13/9/22 TASK GREENS 
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		WebElement OverView = driver.findElement(By.xpath("//span[text()='Overview']"));
//		OverView.click();		
//		Thread.sleep(3000);
//		WebElement Text = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium')]"));
//		String text2 = Text.getText();
//		System.out.println(text2);
//		
		
		
		
         /*          
		13/9/22
		TASK-1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement text = driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']"));
		String text2 = text.getText();
		System.out.println(text2);
		WebElement text1 = driver.findElement(By.xpath("// p[contains(text(),'Adactin Launches The Adactin Hotel App! ')]"));
		WebElement attributename = driver.findElement(By.xpath("//p[contains(@style,'text-align:center;')]"));
		WebElement gettext = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
		
		
		//TASK-2
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
		WebElement text = driver.findElement(By.xpath("//a[text()='Conditions of Use']"));
		String text2 = text.getText();
		System.out.println(text2);
		
		//using getattribute
		driver.get("https://www.amazon.com/");
		WebElement txtbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtbox.sendKeys("surya");
		String attribute = txtbox.getAttribute("value");
		System.out.println(attribute);
		*/
	}
}
	
	
    /*    
	DATE-14/9/22
	TASK-1
	System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement createaccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	createaccount.click();
	Thread.sleep(3000);
	WebElement Firstname = driver.findElement(By.name("firstname"));
	Firstname.sendKeys("surya");		

	TASK-2
	System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement Username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	Username.sendKeys("surya");
	WebElement Password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	Password.sendKeys("12345");
	Thread.sleep(3000);
	WebElement Login = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
	Login.submit();
    */
		





		
		
	



