package batch7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swagLapProject {
	public static void main(String[] args) throws InterruptedException {
		
		
		
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver1=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//Thread.sleep(3000);
		
	    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	    //driver.findElement(By.className("btn_primary btn_inventory")).click();
	    driver.findElement(By.className("shopping_cart_link")).click();
	    //driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
	    //driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']")).click();
	   // driver.findElement(By.className("shopping_cart_badge")).click();
	    driver.findElement(By.id("checkout")).click();
	    driver.findElement(By.className("btn btn_action btn_medium checkout_button ")).click();
	    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Nishi");
	    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Moni");
	    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");
	    //driver.findElement(By.id("first-name")).sendKeys("Nishi");
		//driver.findElement(By.id("last-name")).sendKeys("Moni");
		//driver.findElement(By.id("postal-code")).sendKeys("12345");
	    
		driver.findElement(By.id("continue")).click();
		//CSS
		//driver.findElement(By.cssSelector("input#continue")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
