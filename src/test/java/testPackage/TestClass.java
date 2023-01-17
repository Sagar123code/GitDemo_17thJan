package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestClass {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void browserSetup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEL\\eclipse-workspace\\FlipKart\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		this.driver=driver;
		
		
	}
	
	@Test
	
	public void firstTest() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
//		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		
		driver.findElement(By.xpath("//a[text()='Mi']")).click();
	}

}