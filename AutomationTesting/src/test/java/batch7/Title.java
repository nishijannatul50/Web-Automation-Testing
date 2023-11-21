package batch7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {
	
	public static void main(String[] args) {
		String expectedtitle="Log in to Facebook";
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://m.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		String actualtitle=driver.getTitle();
		
		Assert(actualtitle,expectedtitle);
		driver.close();
	}

	private static void Assert(String actualtitle, String expectedtitle) {
		// TODO Auto-generated method stub
		
	}

}
