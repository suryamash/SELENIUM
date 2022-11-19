package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) {
	
		
	/*
		//DAY-3 Q-1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtbox.sendKeys("iphone");
		WebElement Searchbox = driver.findElement(By.id("nav-search-submit-button"));
		Searchbox.click();
		WebElement Search = driver.findElement(By.xpath("//input[@value='Go']"));
		Search.click();
		
		//DAY-3 Q-2
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/\r\n");		
		String title = driver.getTitle();
		System.out.println(title);		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='DUMMY1']"));
		txtUserName.sendKeys("dummy");		
		WebElement txtPassword = driver.findElement(By.id("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		txtPassword.sendKeys("access");		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUserName.sendKeys("surya");		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("12345@222");		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
		txtFirstName.sendKeys("surya_mash");		
		WebElement txtsearchbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearchbox.sendKeys("iphone");		
		WebElement Search = driver.findElement(By.xpath("//input[@value='Go']"));
        Search.click();				
		
		//DAY-3 Q-3
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement Male = driver.findElement(By.xpath("//input[@value='Male']"));
		Male.click();
		WebElement Cricket = driver.findElement(By.xpath("//input[@value='Cricket']"));
		Cricket.click();
		WebElement Movies = driver.findElement(By.xpath("//input[@value='Movies']"));
		Movies.click();
		WebElement Hockey = driver.findElement(By.xpath("//input[@value='Hockey']"));
		Hockey.click();
		
		/*
		DAY-3 Q-5 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement InterviewQue = driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[1]"));
		InterviewQue.click();
		WebElement TcsInterviewQue = driver.findElement(By.xpath("(//a[text()='TCS Interview Question '])[1]"));
		TcsInterviewQue.click();
		*/
		
		/*
		DAY-3 Q-6 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement Signin = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		Signin.click();
		WebElement Signup = driver.findElement(By.xpath("//li[@id='signInLink']"));
		Signup.click();
		WebElement MobNum = driver.findElement(By.xpath("(//input[@placeholder='Enter your mobile number'])[2]']"));
		MobNum.sendKeys("123456789");
		WebElement GenerateOTP = driver.findElement(By.xpath("//span[text()='GENERATE OTP ']"));
		GenerateOTP.click();
		*/
		
		/*
		DAY-3 Q-7
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement From = driver.findElement(By.id("from_station"));
		From.sendKeys("Chennai");
		WebElement To = driver.findElement(By.id("to_station"));
		To.sendKeys("Salem");
		WebElement SearchTrains = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		SearchTrains.click();
		
		
		/*
		DAY-3 Q-8 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement ModelResume = driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[3]"));
		ModelResume.click();
		WebElement Model1 = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
		Model1.click();
		*/
		
		/*
		DAY-3 Q-9 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
		//Login.click();
		WebElement UserEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		UserEmail.sendKeys("suryamash9x3@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("123456782");
		WebElement LogIN = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		LogIN.click();
		*/
		
		/*
		DAY-3 Q-10 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement SmartTV = driver.findElement(By.xpath("//span[text()='Smart LED TVs']"));
		SmartTV.click();
		*/
		
		/*
		DAY-3 Q-11
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	    WebElement FirstName = driver.findElement(By.id("firstName"));	
	    FirstName.sendKeys("surya");
	    WebElement LastName = driver.findElement(By.id("lastName"));
	    LastName.sendKeys("P");
	    WebElement UserName = driver.findElement(By.id("username"));
	    UserName.sendKeys("suryamash9x3");
	    WebElement Name = driver.findElement(By.name("Passwd"));
	    Name.sendKeys("sury5559x3");
	    WebElement ConfirmPassword = driver.findElement(By.className("whsOnd zHQkBf"));
	    ConfirmPassword.sendKeys("sury5559x3");
	    WebElement ShowPassword = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
	    ShowPassword.click();
	    WebElement Next = driver.findElement(By.className("VfPpkd-vQzf8d"));
	    Next.click();
	    */
		
		/*
		DAY-3 Q-11 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("surya");
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("p");
		WebElement UserMail = driver.findElement(By.id("username"));
		UserMail.sendKeys("suryamsh9x3");
		WebElement Password = driver.findElement(By.name("Passwd"));
		Password.sendKeys("surya5559x3");
		WebElement ConformPass = driver.findElement(By.name("ConfirmPasswd"));
		ConformPass.sendKeys("surya5559x3");
		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		CheckBox.click();
		WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click();
		WebElement PhoneNum = driver.findElement(By.xpath("//input[@type='tel']"));
		PhoneNum.sendKeys("6369402173");
		WebElement Next1 = driver.findElement(By.xpath("//span[text()='Next']"));
		Next1.click();
		*/
		

		/*
		//DAY-3 Q-12 NOTFOUND (USE DROPANDDOWN)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement SignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		SignIn.click();
		WebElement Register = driver.findElement(By.xpath("(//span[text()='Register'])[1]"));
		Register.submit();
		WebElement UserMail = driver.findElement(By.xpath("//input[@id='userName']"));
		UserMail.sendKeys("suryamash9x3@gmail.com");
		WebElement Continue = driver.findElement(By.xpath("(//button[text()='continue'])[1]"));
		Continue.click();
		*/
		
		
		/*
	    DAY-3 Q=13
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement MobNum = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		MobNum.sendKeys("12345");
		*/
		
		/*
		DAY-3 Q-14 TASK
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\eclipse-workspace\\SeleniumProgram\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
		SignUp.click();
		WebElement Phone = driver.findElement(By.xpath("//input[@id='mobile']"));
		Phone.sendKeys("6369402173");
		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("surya");
		WebElement UserMail = driver.findElement(By.xpath("//input[@id='email']"));
		UserMail.sendKeys("suryamash9x3@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("surya5559x3");
		WebElement Continue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		Continue.click();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		 
		  
		  
		  
		  
	}

}
