package kineo.LmsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class AppTest 
{
	@Test
	public void fun1()
	
	 {
		
		System.setProperty("webdriver.gecko.driver","/Users/admin/Desktop/Images/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.sephora.com/");

		WebElement element = driver.findElement(By.cssSelector("span.css-1qhmto6 span"));
		AppTest.flash(driver, element);
		System.out.println("1234");

	}

	public static void flash(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid black;');", element);
		
	}

		
	 }

	 
