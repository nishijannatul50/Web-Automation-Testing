package batch7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys("abc");
		driver.findElement(By.id("lname")).sendKeys("xyz");
		WebElement radiobutton=driver.findElement(By.id("female"));
		radiobutton.click();
		radiobutton.isDisplayed();
		System.out.println("isDisplayed");
		System.out.println(radiobutton.isDisplayed());
		radiobutton.isEnabled();
		System.out.println(radiobutton.isEnabled());
		System.out.println("isEnabled");
		radiobutton.isSelected();
		System.out.println("isSelected");
		System.out.println(radiobutton.isSelected());
	    Thread.sleep(3000);
	    driver.findElement(By.id("male")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("other")).click();
	    Thread.sleep(3000);
	    driver.close();
		
	}

}
