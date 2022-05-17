import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Website {


	private WebDriver driver;

	String chromeDriverPath = "/src/test/resources/mac/chromedriver";
	String projectPath = System.getProperty("user.dir");
	protected String baseUrl = "https://letsgo.com";
	
	
	@Test
	public void LetsGOOO() {
		System.setProperty("webdriver.chrome.driver", projectPath + chromeDriverPath);
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);	

		
		WebElement clickFoodButton = driver.findElement(By.cssSelector("div>ul>li>a[href='https://letsgo.com/category/food/']"));
		clickFoodButton.click(); 

	}
	


}
