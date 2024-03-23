package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();

		WebElement mo1 = driver.findElement(By.xpath("(//img[@alt=\"User Avatar\"])[2]"));
		
		WebElement mo2 = driver.findElement(By.xpath("(//a[text()='View profile'])[2]"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(mo1).moveToElement(mo2).click().build().perform();
		
		
	}

}




