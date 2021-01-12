package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest01 {
	WebDriver driver;

	@BeforeTest
	public void setUp () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahnaj\\eclipse-workspace\\TestNG001\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}
	@Test
	public void loginTest () {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();



	}
	@AfterTest
	public void tearDowntest () {
		driver.close();
		driver.quit();



	}

}
