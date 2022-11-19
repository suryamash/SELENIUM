package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// select:c------->  1.SelectByIndex(10)
//                   2.SelectByValue("IND")
//                   3.SelectByVisibleText("India")
// select:c-------->1.SelectByValue("IND")
//                    2.SelectByVisibleText()--m
//                    3.SelectByIndex()--m
//                    4.getoptions()--m
//                    5.getAllselectedOptions()--m
//                    6.getFirstSelectedOptions()--m
//                    7.ismultiple()--m
//                    8.deSelectByIndex()--m
//                    9.deSelectByValue()--m
//                    10.deSelectByVisibleText()--m
//                    11.deSelectAll()--m
                    

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select select = new Select(fruit);
		
		//check wheather able to select multiple options or not
				boolean b = select.isMultiple();
				System.out.println(b);
		//select multiple option
			select.selectByValue("orange");
		    select.selectByVisibleText("Grape");
	   //print first selected option
		    WebElement first = select.getFirstSelectedOption();
		    String text = first.getText();
		    System.out.println(text);
		//select all options from dropdown
		    List<WebElement> alloptions = select.getOptions();
		    for (WebElement options : alloptions) {
		    	String text2 = options.getText();
		    	System.out.println(text2);				
			}
		    for (WebElement option : alloptions) {
		    	String attribute = option.getAttribute("value");
		    	select.selectByValue(attribute);				
			}		    
		    //deselect option
		    select.deselectByValue("apple");
		    select.deselectByVisibleText("Grape");
		    
		    //print only selected options
		    List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		    for (WebElement selectedoptions : allSelectedOptions) {
		    	String text2 = selectedoptions.getText();
		    	System.out.println(text2);				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//	 //   Thread.sleep(2000);
//	    WebElement ddnmonth = driver.findElement(By.xpath("//select[@id='month']"));
//	    
//	    //using select class
//	    Select select=new Select(ddnmonth);
//	    
//	    //select using index
//	    select.selectByIndex(0);
//	    Thread.sleep(3000);
//	    
//	    //select using value
//	    select.selectByValue("3");
//	    Thread.sleep(3000);
//	    
//	    //select using text
//	    select.selectByVisibleText("Jun");
//	    
		
		
	}
	

}
