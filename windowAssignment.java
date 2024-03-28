package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowAssignment {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://the-internet.herokuapp.com/");
		  driver.findElement(By.linkText("Multiple Windows")).click();
		 
		  Set<String> window=driver.getWindowHandles();
		 
		 Iterator<String> it =window.iterator();
		 
		 String parentid=it.next();
		 driver.switchTo().window(parentid);
		
	     driver.findElement(By.linkText("Click Here")).click();
	     String childid=it.next();
	    driver.switchTo().window(childid);
	    	System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
	    	
	    	driver.switchTo().window(parentid);
	    	
	    	System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
	    	
	    	 
	     
	     
		 
	
		 
	}

}
