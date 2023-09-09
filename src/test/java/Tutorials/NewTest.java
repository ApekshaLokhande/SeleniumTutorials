package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//https://github.com/ApekshaLokhande/SeleniumTutorials.git
public class NewTest {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("Yes")).click();
		driver.findElement(By.id("buttoncheck")).click();

  }
}
