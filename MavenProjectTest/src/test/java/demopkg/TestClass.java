package demopkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
	}
	@Test
	public void operation() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Seelneium",Keys.ENTER);
		Thread.sleep(3000);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	

}
