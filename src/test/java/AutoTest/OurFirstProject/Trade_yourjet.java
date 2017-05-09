package AutoTest.OurFirstProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trade_yourjet extends drivers {

@When("^I click the trade your jet tab$")
public void i_click_the_trade_your_jet_tab() throws Throwable {
   driver.findElement(By.id("TradeYourJetTab")).click();
}

@When("^I enter current jet price$")
public void i_enter_current_jet_price() throws Throwable {
   driver.findElement(By.id("q1")).sendKeys("15000000");
}

@When("^I enter purchase price$")
public void i_enter_purchase_price() throws Throwable {
	   driver.findElement(By.id("q2")).sendKeys("40000000");

}

@When("^I enter flight time$")
public void i_enter_flight_time() throws Throwable {
	   driver.findElement(By.id("q3")).sendKeys("120000");
}

@When("^I select the relevant radio button$")
public void i_select_the_relevant_radio_button() throws Throwable {
  driver.findElement(By.id("q5")).click();
}

@When("^Click submit$")
public void click_submit() throws Throwable {
	  driver.findElement(By.id("a1")).click();
}

@Then("^I should see a successfully message$")
public void i_should_see_a_successfully_message() throws Throwable {
	String Main_text = driver.findElement(By.xpath("html/body/div[1]/section[2]/div[2]/div/div[2]/p")).getText();
	String Expected_Title = "Thank you for your Message! We will get in touch as soon as possible.";
	Assert.assertEquals(Main_text, Expected_Title);
}

}
