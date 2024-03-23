package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	//INITIALIZE PAGE FACTORY BY CREATING A CONSTRUCTOR
	WebDriver driver;
	
	public PageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement searchBox = driver.findElement(By.id("APjFqb"));	
	//Use Page Factory
	@FindBy(id="APjFqb")
	WebElement searchBox;
	
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}
	
	// WebElement searchBtn;
	// searchBtn = driver.findElement(By.name("btnK"));
	// searchBtn.submit();
	
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	public void clicksearch() {
		searchBtn.submit();
	}
	
	
}


