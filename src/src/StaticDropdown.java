package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// setup the driver 
		WebDriver driver = new ChromeDriver();

		// Enter the page of the practice
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Currency Drop down which is static
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByValue("USD");
		
		//dropdown.selectByIndex(1); // select by using index
		
		//dropdown.selectByVisibleText("USD")  // select by using visible text
		
		// to check the selected drop down is as expected
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		
		
		
	}

}
