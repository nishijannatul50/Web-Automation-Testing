package batch7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTest {
	
	@BeforeTest
	public void BeforeTest1(){
		
		  WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver=new FirefoxDriver();
		    System.out.println("beforetest1");
		
		
	}
	
	
	@Test
	
	public void Test1() {
	
		
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().minimize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.close();
	}
	
	@AfterTest
	public void AfterTest1(){
		
		  
    System.out.println("Aftertest1");
		
		
	}
}
