package Example;

//third commit
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static String driverPath = "/usr/local/bin/";
	public static WebDriver driver;
  @Test
  public void main() {
		driver.navigate().to("http://google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		driver = new ChromeDriver();

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
