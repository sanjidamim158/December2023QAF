package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjects;


public class GoogleSearch extends GoogleBase{
	
	PageObjects po;
	
	@Given("when I am on google home page")
	public void when_i_am_on_google_home_page() {
		launchBrowser();
		
	}
	

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		//step 1: identify/locate the element 
		//8 locators: id, name, class name, html tag, link text, partial link text, xpath, css selector
			//WebElement searchBox = driver.findElement(By.id("APjFqb"));	
		//step 2: perform the actions	
			//searchBox.sendKeys(string);
		
		po = new PageObjects(driver);
		po.enterSearch(string);
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		//WebElement searchBtn = driver.findElement(By.name("btnK"));
		//searchBtn.submit();	   
		
		po.clicksearch();
		
	}

	
	@Then("I receive related search result")
	public void i_receive_related_search_result() {
	
		WebElement result = driver.findElement(By.id("result-stats"));
		
		 ;
		
		String myResult = result.getText();
		System.out.println("**************************************");
		System.out.println(myResult);
		System.out.println("**************************************");
		
		closeBrowser();
		
	}

	
}





