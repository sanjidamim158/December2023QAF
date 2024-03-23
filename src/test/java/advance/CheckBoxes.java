package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		//locates the first check box
		WebElement ch1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
		ch1.click();
		
		WebElement ch2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
		
		//isSelected method to let you know if the check box is selected or not
		boolean chkSelected = ch2.isSelected();
		System.out.println("================================================================");
		System.out.println(chkSelected);
		
		if(chkSelected==true) {
			ch2.click();
		}
		
		
		
	}

	
}

