package scenarios;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		//Creating chrome driver by giving executable file path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RASHMIKA\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver navigates to url
		driver.get("https://accounts.google.com/signup");
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//maximize window
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
	//terminates operation
		driver.quit();
	}

	@Test
	public void test() {
	   
		//creating webelements of textboxes
		WebElement firstName=driver.findElement(By.id("firstName"));
		WebElement lastName=driver.findElement(By.id("lastName"));
		WebElement userName=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.name("Passwd"));
		WebElement confirmPassword=driver.findElement(By.name("ConfirmPasswd"));
		
		//sending values to textboxes
		firstName.sendKeys("Harry");
		lastName.sendKeys("Potter");
		userName.sendKeys("harrypotter.24122602");
		password.sendKeys("harpot@#2412");
		confirmPassword.sendKeys("harpot@#2412");
		
		
		//moving to the next page by clicking on next
		WebElement next=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/span/span"));
		next.click();
		
	}

}
