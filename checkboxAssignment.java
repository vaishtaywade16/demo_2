package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxAssignment {

	public static void main(String[] args) {
	//select anyone checkbox and grab the label present on that
    //on dropdown select that text automatically
	// enter that grab label text on edit box automatically
	// click on alert and then verify that label text is present on popup msg or not	
//https://rahulshettyacademy.com/AutomationPractice/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBox=driver.findElement(By.id("checkBoxOption2"));
		checkBox.click();
	   String labelName=checkBox.getAttribute("value");
	  System.out.println(checkBox.getAttribute("value"));

	  
	 
	  WebElement l1=driver.findElement(By.id("dropdown-class-example"));
	  Select s1 = new Select(l1);
	 
	  List<WebElement>options=s1.getOptions();
	  for(int i=0; i<options.size(); i++) {
		  String desireOption=options.get(i).getAttribute("value");
			
		if( desireOption.contains(labelName))
		   {
			 options.get(i).click();
			}
	
		  }
	  
	 WebElement editBox= driver.findElement(By.id("name"));
	 editBox.click();
	 if(editBox.isEnabled()) {
		 editBox.sendKeys(labelName);
		 
	 }
	driver.findElement(By.id("alertbtn")).click();
	String[] alertmsg=driver.switchTo().alert().getText().split(",");
	String desireMsg = alertmsg[0].split(" ")[1];
	Assert.assertEquals(desireMsg, labelName);
	
	}
}

