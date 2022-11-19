package org.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//ways for switch for windows-----1.driver.switchTo().window(string id)
//                                  2.driver.switchTo().window(string title)
//                                  3.driver.switchTo().window(string url)
//webdriver:I ---->getwindowHandle()=>return type is string
//webdriver:I ---->getwindowHandles()=>return type is Set<string>

public class windowshandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    txtSearch.sendKeys("iphone 13");
	    WebElement btnsearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    btnsearch.click();
	    WebElement btniphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro (256GB) - Graphite']"));
	    btniphone.click();
	    
	    String WindowHandle1 = driver.getWindowHandle();
	    System.out.println(WindowHandle1);
	    
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    System.out.println(windowHandles2);
	    for (String eachwin1 : windowHandles2) {
	    	if (!WindowHandle1.equals(eachwin1)) {
	    		driver.switchTo().window(eachwin1);
				
			}
	    	
			
		}
	    WebElement btnjoinprime = driver.findElement(By.xpath("//a[text()=' Join Prime ']"));
	    btnjoinprime.click();
	    //switch back to parent window
	  //    not prefarable----> // driver.switchTo().defaultContent();
	    driver.switchTo().window(WindowHandle1);
	    Thread.sleep(3000);
	    //click iphone phone
	    WebElement iphone13 = driver.findElement(By.xpath("//span[text()='iPhone 14 512GB Starlight']"));
	    iphone13.click();
	    Thread.sleep(3000);
	    Set<String> windowHandles3 = driver.getWindowHandles();
	    System.out.println(windowHandles3);
	    
	    List<String> li = new ArrayList<String>();
	    //add values in list
	    li.addAll(windowHandles3);
	    //fetch 3rd window id
	    String string = li.get(2);
	    driver.switchTo().window(string);
	    WebElement btnaddWhist = driver.findElement(By.xpath("//a[text()=' Add to Cart  ']"));
	    btnaddWhist.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
