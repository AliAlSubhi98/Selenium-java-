package src;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("TEST is starting");
      String name = "Ali Hamood";
      //after new update no need to setup the driver , as it done on the back end by SeleniumManager (Beta Phase)
//      System.setProperty("webdriver.chrome.driver", "C:\\Users\\alial\\OneDrive\\Desktop\\Files\\chromedriver-win64\\chromedriver.exe"); //windows
//      System.setProperty("webdriver.chrome.driver", "/Users/AliHamood/Documents/chromedriver"); // mac
      WebDriver driver = new ChromeDriver();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      String password = getPassword(driver);
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
      driver.findElement(By.id("inputUsername")).sendKeys(name);
      driver.findElement(By.name("inputPassword")).sendKeys(password);
      driver.findElement(By.className("signInBtn")).click();
      Thread.sleep(2000);
      System.out.println(driver.findElement(By.tagName("p")).getText());
      
      Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
      Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
      driver.findElement(By.xpath("//*[text()='Log Out']")).click();
      driver.close();
  }

  public static String getPassword(WebDriver driver) throws InterruptedException {
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
      driver.findElement(By.linkText("Forgot your password?")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
      String passwordText = driver.findElement(By.cssSelector("form p")).getText();
      String password = passwordText.split("'")[1].split("'")[0];
      return password;
  }
	}


