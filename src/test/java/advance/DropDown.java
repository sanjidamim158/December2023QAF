package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		//locate the element
		WebElement dd1 = driver.findElement(By.id("dropdown"));
		//WebElement dd1 = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
		
		//select class to select a drop down
		Select s1 = new Select(dd1);
		s1.selectByIndex(2);
		s1.selectByVisibleText("Option 1");
		s1.selectByValue("2");
		
		
		
		
	}

	
}
