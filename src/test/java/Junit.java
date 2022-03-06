import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void afterClass() {
		driver.quit();

	}
	@Before
	public void beforeTest() {
		long starttime = System.currentTimeMillis();
		System.out.println(starttime);
		
	}
	@After
	public void afterMethod() {
		long endtime = System.currentTimeMillis();
		System.out.println(endtime);
	}
	@Test
	public void login() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("naveen53");
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("C1IZAU");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();

	}
	

}
