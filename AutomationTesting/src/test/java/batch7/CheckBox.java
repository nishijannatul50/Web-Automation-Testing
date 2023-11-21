package batch7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		
		 WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			WebElement checkbox=driver.findElement(By.id("checkBoxOption2"));
			checkbox.click();
			assert checkbox.isDisplayed();
			System.out.println(checkbox.isDisplayed());
			checkbox.isEnabled();
			assert checkbox.isSelected();	}
	

}
