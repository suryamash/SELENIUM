package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseoverDragAnsDrop { 
	public static void main(String[] args) {
		
		
		
		/*
		//DAY-2 Q-5 TASK NOT WORKING
			System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();	
			 driver.get("https://netbanking.hdfcbank.com/netbanking/");
			 driver.manage().window().maximize();
			 WebElement UserID = driver.findElement(By.name("fldLoginUserId"));
			 UserID.sendKeys("surya");
			 WebElement Continue = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
			 Continue.click();
			 */
		
		 /*
		 DAY-2 Q-4 TASK
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();		
		 driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		 driver.manage().window().maximize();
		 WebElement UserId = driver.findElement(By.xpath("//input[@id='DUMMY1']"));
		 UserId.click();
		 WebElement UserID = driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));
		 UserID.sendKeys("surya");
		 WebElement Pass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		 Pass.sendKeys("123456");
		 WebElement DashBoard = driver.findElement(By.xpath("(//div[@class='selectedTxt'])[1]"));
		 DashBoard.click();
		 WebElement BankAcct = driver.findElement(By.xpath("//a[text()='Bank Account']"));
		 BankAcct.click();
		 WebElement CheckBox = driver.findElement(By.xpath("//input[@id='AuthenticationFG.REMEMBER_USERID_CHECKBOX']"));
		 CheckBox.click();
		 WebElement BtnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
		 BtnLogin.click();
		 /*
		  
		  /*
		 DAY-2 Q-8 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	
		 driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		 WebElement UserName = driver.findElement(By.name("username"));
		 UserName.sendKeys("surya");
		 WebElement Password = driver.findElement(By.name("password"));
		 Password.sendKeys("1234567");
		 WebElement Login = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		 Login.click();
		 */
		
		/*
		DAY-2 Q-9 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	
		 driver.get("https://demo.automationtesting.in/Register.html");
		 WebElement FirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 FirstName.sendKeys("surya");
		 WebElement LastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 LastName.sendKeys("p");
		 WebElement Address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		 Address.sendKeys("ghj");
		 WebElement UserMail = driver.findElement(By.xpath("//input[@type='email']"));
		 UserMail.sendKeys("suryamash9x3@gmail.com");
		 WebElement Phone = driver.findElement(By.xpath("//input[@type='tel']"));
		 Phone.sendKeys("6369402173");
		 WebElement Male = driver.findElement(By.xpath("//input[@value='Male']"));
			Male.click();
			WebElement Cricket = driver.findElement(By.xpath("//input[@value='Cricket']"));
			Cricket.click();
			WebElement Movies = driver.findElement(By.xpath("//input[@value='Movies']"));
			Movies.click();
			WebElement Hockey = driver.findElement(By.xpath("//input[@value='Hockey']"));
			Hockey.click();
			WebElement Language = driver.findElement(By.xpath("//div[@id='msdd']"));
			Language.click();
			WebElement English = driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]"));
			English.click();
			WebElement SelectSkills = driver.findElement(By.xpath("//select[@id='Skills']"));
			SelectSkills.submit();
			WebElement Java = driver.findElement(By.xpath("//option[text()='Java']"));
			Java.click();
			WebElement Countries = driver.findElement(By.xpath("//select[@id='countries']"));
			Countries.click();
			WebElement SelectCountry = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
			SelectCountry.click();
			WebElement India = driver.findElement(By.xpath("//li[text()='India']"));
			India.click();
			WebElement SelectYear = driver.findElement(By.xpath("//select[@id='yearbox']"));
			SelectYear.click();
			WebElement Year = driver.findElement(By.xpath("//option[@value='1997']"));
			Year.click();
			WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Month.click();
			WebElement April = driver.findElement(By.xpath("//option[@value='April']"));
			April.click();
			WebElement Day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
			Day.click();
			WebElement Day27 = driver.findElement(By.xpath("//option[@value='27']"));
			Day27.click();
			WebElement FrstPassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
			FrstPassword.sendKeys("2345678");
			WebElement SecondPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
			SecondPassword.sendKeys("2345678");
			WebElement btnsubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
			btnsubmit.click();
			*/
		  
		
		/*
		// 16-9-22  TASK-1 FLIPCART
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();		
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 WebElement CancelButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 CancelButton.click();
		 WebElement InkMore = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(InkMore).perform();
		 WebElement CustCare = driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"));
		 CustCare.click();
		 WebElement Text = driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]"));
		 String text2 = Text.getText();
		 System.out.println(text2);
		 */
		 
		
		/*
		DAY-16/9/22 TASK OMR BRANCH -2
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	
		 driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		 driver.manage().window().maximize();
		 WebElement S = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		 WebElement D = driver.findElement(By.xpath("//ol[@id='java-class']"));
		 Actions actions= new Actions(driver);
		 actions.dragAndDrop(S,D).perform();		 
		 WebElement WebDriver = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		 WebElement Web = driver.findElement(By.xpath("//ol[@id='selenium-interface']"));
		 Actions actions1= new Actions(driver);
		 actions1.dragAndDrop(WebDriver,Web).perform();		 
		 WebElement ActionClass = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 WebElement Action = driver.findElement(By.xpath("//ol[@id='selenium-class']"));
		 Actions actions2= new Actions(driver);
		 actions2.dragAndDrop(ActionClass,Action).perform();		 
		 WebElement List = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		 WebElement  Java = driver.findElement(By.xpath("//ol[@id='java-interface']"));
		 Actions actions3= new Actions(driver);
		 actions3.dragAndDrop(List,Java).perform();		 
		 WebElement Success = driver.findElement(By.xpath("//a[@class='button button-green']"));
		 String text = Success.getText();
		 System.out.println(text);
		 */
			
	}
}
	


