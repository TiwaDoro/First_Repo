package AutoTest.OurFirstProject;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends drivers {


	// 3 types of selector are been use for this test
	// ID is been use, link Text, Name.

@Given("^am on the Landing Page$")
public void am_on_the_Landing_Page() throws Throwable {
	driver.manage().window().maximize();
	driver.get("http://automatetillinfinity.co.uk/");
    
}

@When("^I enter my username and password$")
public void i_enter_my_username_and_password() throws Throwable {
   driver.findElement(By.id("usernamelogin")).sendKeys("wegit");
   driver.findElement(By.name("passwd")).sendKeys("12345678");
}

@When("^I click Login button$")
public void i_click_Login_button() throws Throwable {
    driver.findElement(By.id("LoginBtn")).click();
}

@Then("^I should see the Home Page$")
public void i_should_see_the_Home_Page() throws Throwable {
	String Main_title = driver.getTitle();
	String Expected_Title = "Home";
	Assert.assertEquals(Main_title, Expected_Title);	
}

@Then("^I click logout$")
public void i_click_logout() throws Throwable {
    driver.findElement(By.linkText("Logout")).click();
}

@Then("^I should be on the landing page$")
public void i_should_be_on_the_landing_page() throws Throwable {
	String Main_title = driver.getTitle();
	String Expected_Title = "Login";
	Assert.assertEquals(Main_title, Expected_Title);
	/*
	Actions action = new Actions(driver); 
	action.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).perform();
}
@Then("^I click print the screen button$")
public void i_click_print_the_screen_button() throws Throwable {
	Actions action = new Actions(driver); 
	action.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).perform();
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("C:\\Screenshot\\Selenium_demo\\test.png"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	 */
} 

@Then("^I should print the screen$")
public void i_should_print_the_screen() throws Throwable {
	
}
@After
public void closesession(){
	//driver.quit();
	//driver = null;
}
}

