package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDay1 {
	
	public static void main(String[] args) {
		
		//configure the driver with program
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		
		//to launch the browser
		//webdriver----->is a interface
		//chromeDriver ----> is a class
		WebDriver driver = new ChromeDriver();
		
		//get---->to enter url
		driver.get("https://www.flipkart.com/");
		
		//by using navigate command 
		//driver.navigate().to("https://www.facebook.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to move back to the chrome browser
		driver.navigate().back();
		
		//to move from chrome to facebook page.
		driver.navigate().forward();
		
		//to reload the page
		driver.navigate().refresh();
		
		//ctrl+2 and release and click L to get the return type.
		String title = driver.getTitle();
		System.out.println(title);
		
		//to print the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to quit the browser
		//driver.quit();
	}

}
