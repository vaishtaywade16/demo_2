package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
	System.out.println("Number of rows="+driver.findElements(By.cssSelector(".table-display tr")).size());
	System.out.println("Number of columns="+driver.findElements(By.cssSelector(".table-display th")).size());
	
	System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
	}

}
