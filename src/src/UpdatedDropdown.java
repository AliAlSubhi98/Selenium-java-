package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//enter the url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		// find the drop down and click
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		// Click on Adult + 
		driver.findElement(By.id("hrefIncAdt")).click();
		
		// Click on Child + -> 5 times 
		for (int i=1 ; i<5 ; i++) { 
			
			driver.findElement(By.id("hrefIncChd")).click();

		}

		// Click on Infant + 
		driver.findElement(By.id("hrefIncInf")).click();

		//click on Done
		driver.findElement(By.id("btnclosepaxoption")).click();

		
		
		
		

	}

}
