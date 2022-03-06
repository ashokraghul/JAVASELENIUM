import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		action.moveToElement(element2).perform();
		
		WebElement element3 = driver.findElement(By.xpath("////span[text()='Performance Tuning']"));
		element3.click();
	}

}

