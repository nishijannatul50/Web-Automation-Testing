package batch7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver=new EdgeDriver();
	driver.get("https://trytestingthis.netlify.app/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	WebElement dropdown=driver.findElement(By.id("option"));

    Select selectobject = new Select(dropdown);
    Thread.sleep(3000);
    selectobject.selectByIndex(1);
    Thread.sleep(3000);
    selectobject.selectByValue("option 3");
    Thread.sleep(3000);
    selectobject.selectByVisibleText("Option 2");
	
	
	
	}

}
