package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestedDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement countryDropdown=driver.findElement(By.id("autocomplete"));
		countryDropdown.click();
		countryDropdown.sendKeys("uni");
		Actions action=new Actions((WebDriver) countryDropdown);
		action.scrollToElement((driver.findElement(By.id("ui-id-93"))));

	}

}
