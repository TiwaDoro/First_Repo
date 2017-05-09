package AutoTest.OurFirstProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationPaneStep extends drivers {
	
	
	@Then("^I should be on trade your jet page$")
	public void i_should_be_on_trade_your_jet_page() throws Throwable {
	String Actual = driver.findElement(By.cssSelector(".content-header")).getText();
	String Expected = "Trade Your Jet";
	Assert.assertEquals(Actual, Expected);
	}

	@When("^I click the book your jet tab$")
	public void i_click_the_book_your_jet_tab() throws Throwable {
	    driver.findElement(By.cssSelector("#bookyourjettab>a")).click();
	}

	@Then("^I should be on book your jet page$")
	public void i_should_be_on_book_your_jet_page() throws Throwable {
		String Actual = driver.findElement(By.cssSelector(".content-header")).getText();
		String Expected = "Book Your Jet";
		Assert.assertEquals(Actual, Expected);
	}

	@When("^I click the just trade tab$")
	public void i_click_the_just_trade_tab() throws Throwable {
		driver.findElement(By.cssSelector("#justtradetab>a")).click();

	}

	@Then("^I should be on just trade page$")
	public void i_should_be_on_just_trade_page() throws Throwable {
		String Actual = driver.findElement(By.cssSelector(".content-header")).getText();
		String Expected = "Just Trade";
		Assert.assertEquals(Actual, Expected);
	}
	@When("^I click the about us tab$")
	public void i_click_the_about_us_tab() throws Throwable {
		driver.findElement(By.cssSelector("#aboutustab>a")).click();

	}

	@Then("^I should be on about us page$")
	public void i_should_be_on_about_us_page() throws Throwable {
		String Actual = driver.findElement(By.cssSelector(".content-header")).getText();
		String Expected = "About Us";
		Assert.assertEquals(Actual, Expected);
	}

	@When("^I click the contact us tab$")
	public void i_click_the_contact_us_tab() throws Throwable {
		driver.findElement(By.cssSelector("#contactsupporttab>a")).click();
	}

	@Then("^I should be on contact us page$")
	public void i_should_be_on_contact_us_page() throws Throwable {
		String Actual = driver.findElement(By.cssSelector(".content-header")).getText();
		String Expected = "Contact Support";
		Assert.assertEquals(Actual, Expected);
	}	

}
