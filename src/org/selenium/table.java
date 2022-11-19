package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// to find number of rows in the webpage.
		 driver.findElement(By.xpath("//label[text()='Date']")).click();		  
		 List<WebElement>rows= driver.findElements(By.tagName("tr"));
         int s=rows.size();	
		 System.out.println(s);
		 
		 //to get the particular row in dates 
		 List<WebElement>particularrows= driver.findElements(By.tagName("tr"));
		 WebElement sixrow = particularrows.get(2);		
	     List<WebElement>all=	sixrow.findElements(By.tagName("td"));		
		 int datacount=all.size();
		 System.out.println(datacount);
		
		//fetch data from current row
		 
		 List<WebElement>all1=	sixrow.findElements(By.tagName("td"));	
		 for (WebElement data: all1) {
			 String text = data.getText();
			 System.out.print(text);
			 
			 // to fetch the particular number in the particular row & column
			 
			 List<WebElement>rows1= driver.findElements(By.tagName("tr"));
			 for (int i = 0; i < rows1.size(); i++) {
				 WebElement r=rows1.get(i);
			 
				 List<WebElement>alldate= r.findElements(By.tagName("td"));
				 for (int j = 0; j < alldate.size(); j++) {
					 WebElement  date = alldate.get(j);
					 String text2 = date.getText();
					 System.out.print(text2);
				 System.out.println();
					 if (text2.equals("26")) {
						 System.out.println(i+1);
						 System.out.println(j+1);
						
					 }
					
				}
				 	 
				 
				 
				 
				 
				 
				 
			}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
