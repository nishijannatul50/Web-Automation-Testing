package batch7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//minimize the window
		driver.manage().window().minimize();
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		//Thread.sleep(5000);
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//driver.close();
		
		
		//driver.quit();
	

	}

}
