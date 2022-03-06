import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassIntegration {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseClass baseClass = new BaseClass();

		baseClass.getDriver();

		baseClass.urlLaunch("https://adactinhotelapp.com/");

		baseClass.maximize();

		WebElement txtUser = baseClass.findElementById("username");
		String name = baseClass.getData("Datas", 1, 0);
		baseClass.sendkeys(txtUser, name);

		WebElement txtpass = baseClass.findElementById("password");
		String pass = baseClass.getData("Datas", 1, 1);
		baseClass.sendkeys(txtpass, pass);

		WebElement btnlogin = baseClass.findElementById("login");
		baseClass.click(btnlogin);

		WebElement dDnlocation = baseClass.findElementById("location");
		baseClass.click(dDnlocation);
		baseClass.selectOptionByIndex(dDnlocation, 1);

		WebElement dDnhotel = baseClass.findElementById("hotels");
		baseClass.click(dDnhotel);
		baseClass.selectOptionByIndex(dDnhotel, 1);

		WebElement dDnroom = baseClass.findElementById("room_type");
		baseClass.click(dDnroom);
		baseClass.selectOptionByIndex(dDnroom, 1);

		WebElement dDnsubmit = baseClass.findElementById("Submit");
		baseClass.click(dDnsubmit);

		WebElement dDnSelec = baseClass.findElementByXpath("//input[@type='radio']");
		baseClass.click(dDnSelec);

		WebElement dDnContinue = baseClass.findElementById("continue");
		baseClass.click(dDnContinue);

		WebElement txtFirst = baseClass.findElementById("first_name");
		String fname = baseClass.getData("Datas", 1, 2);
		baseClass.sendkeys(txtFirst, fname);

		WebElement txtLast = baseClass.findElementById("last_name");
		String lname = baseClass.getData("Datas", 1, 3);
		baseClass.sendkeys(txtLast, lname);

		WebElement txtAddress = baseClass.findElementById("address");
		String address = baseClass.getData("Datas", 1, 4);
		baseClass.sendkeys(txtAddress, address);

		WebElement txtcard = baseClass.findElementById("cc_num");
		String card = baseClass.getData("Datas", 1, 5);
		baseClass.sendkeys(txtcard, card);

		WebElement Ddncc = baseClass.findElementById("cc_type");
		baseClass.click(Ddncc);
		baseClass.selectOptionByIndex(Ddncc, 1);

		WebElement Ddnmonth = baseClass.findElementById("cc_exp_month");
		baseClass.click(Ddnmonth);
		baseClass.selectOptionByIndex(Ddnmonth, 3);

		WebElement Ddnyear = baseClass.findElementById("cc_exp_year");
		baseClass.click(Ddnyear);
		baseClass.selectOptionByIndex(Ddnyear, 12);

		WebElement txtcvv = baseClass.findElementById("cc_cvv");
		String cvv = baseClass.getData("Datas", 1, 6);
		baseClass.sendkeys(txtcvv, cvv);

		WebElement Ddnbook = baseClass.findElementById("book_now");
		baseClass.click(Ddnbook);

		baseClass.implicitWait(300);

		WebElement dDnorder = baseClass.findElementById("order_no");
		String attribute = baseClass.getAttribute(dDnorder);
		baseClass.writeData("Datas", 1, 7, attribute);

	}
}
