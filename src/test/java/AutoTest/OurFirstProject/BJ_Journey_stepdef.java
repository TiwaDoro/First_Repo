package AutoTest.OurFirstProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BJ_Journey_stepdef extends drivers{
	
	@Given("^I enter my start destination$")
	public void i_enter_my_start_destination() throws Throwable {
	    driver.findElement(By.cssSelector("#q1")).sendKeys("Monaco");
	}

	@Given("^I enter my end destination$")
	public void i_enter_my_end_destination() throws Throwable {
	    driver.findElement(By.cssSelector("#q2")).sendKeys("Necker");
	}

	@Given("^I select a zone$")
	public void i_select_a_zone() throws Throwable {
	   Select name_of_dropdown = new Select (driver.findElement(By.cssSelector("#q15")));
	   name_of_dropdown.selectByVisibleText("US");
	  
	}

	@When("^I click the relevant check box$")
	public void i_click_the_relevant_check_box() throws Throwable {
	   driver.findElement(By.cssSelector("#checkbox1")).click();
	   driver.findElement(By.xpath(".//form/input[6]")).click();

	}

	@When("^I select no radio button$")
	public void i_select_no_radio_button() throws Throwable {
		   driver.findElement(By.xpath(".//form/input[10]")).click();
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		   driver.findElement(By.cssSelector("#a1")).click();
	}

	@Then("^a successfull confirmation message is displayed$")
	public void a_successfull_confirmation_message_is_displayed() throws Throwable {
	   String Actual = driver.findElement(By.cssSelector(".content>form>p")).getText();
	   String Expected = "Thank you for completing the form. We shall get back to you soonest.";
	   Assert.assertEquals(Expected, Actual);
	}
}
