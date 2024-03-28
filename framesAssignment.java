package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://the-internet.herokuapp.com/");
		  driver.findElement(By.linkText("Nested Frames")).click();
		  Set <String> windows=driver.getWindowHandles();
		  Iterator<String> it =windows.iterator();
		  String parentid=it.next();
		  String childid=it.next();
		  driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.tagName("frameset")).getSize());
	}

}
