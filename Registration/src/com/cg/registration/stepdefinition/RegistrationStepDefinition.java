package com.cg.registration.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.registration.beans.ConferenceRegistrationPage;
import com.cg.registration.beans.PaymentDetailsPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition {
	private WebDriver driver;
	private ConferenceRegistrationPage register;
	private PaymentDetailsPage details;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
	}
	
	@Given("^user is on conference registration page$")
	public void user_is_on_conference_registration_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("file:///D:/MPT%20Set%201/ConferenceRegistartion.html");
		register = PageFactory.initElements(driver, ConferenceRegistrationPage.class);
		details = PageFactory.initElements(driver, PaymentDetailsPage.class);
	}

	@Then("^conference registration page should load with tile 'Conference Registration'$")
	public void conference_registration_page_should_load_with_tile_Conference_Registration() throws Throwable {
		String expectedTitle="Conference Registartion";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user will click on next without entering First Name$")
	public void user_will_click_on_next_without_entering_First_Name() throws Throwable {
		
		register.setFirstname("");
		register.clickNext();
		
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Last Name$")
	public void user_will_click_on_next_without_entering_Last_Name() throws Throwable {
		register.setFirstname("Jai");
		register.clickNext();
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Email$")
	public void user_will_click_on_next_without_entering_Email() throws Throwable {
		register.setLastname("Jaggi");
		register.clickNext();
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Contact no\\.$")
	public void user_will_click_on_next_without_entering_Contact_no() throws Throwable {
		register.setEmail("jai@gmail.com");
		register.clickNext();
	}

	@Then("^'Please fill the Contact No\\.' message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next withot entering valid Contact no\\.$")
	public void user_will_click_on_next_withot_entering_valid_Contact_no() throws Throwable {
		register.setContactNo("9000");
		register.clickNext();
	}

	@Then("^'Please enter valid Contact no\\.' message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without selecting Number of people attending$")
	public void user_will_click_on_next_without_selecting_Number_of_people_attending() throws Throwable {
		register.setContactNo("417627");
		register.clickNext();
	}

	@Then("^'Please fill the Number of people attending' message should display$")
	public void please_fill_the_Number_of_people_attending_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Number of people attending";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Building Name & Room No\\.$")
	public void user_will_click_on_next_without_entering_Building_Name_Room_No() throws Throwable {
		register.setSel("3");
		register.clickNext();
	}

	@Then("^'Please fill the Building & Room No' message should display$")
	public void please_fill_the_Building_Room_No_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Building & Room No";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Area Name$")
	public void user_will_click_on_next_without_entering_Area_Name() throws Throwable {
		register.setAddress("WhiteField");
		register.clickNext();
		
	}

	@Then("^'Please fill the Area name' message should display$")
	public void please_fill_the_Area_name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Area name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without selcting City$")
	public void user_will_click_on_next_without_selcting_City() throws Throwable {
	    register.setArea("phase3");
	    register.clickNext();
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without selecting State$")
	public void user_will_click_on_next_without_selecting_State() throws Throwable {
	   register.setCity("Pune");
	   register.clickNext();
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without selecting Membership Status$")
	public void user_will_click_on_next_without_selecting_Membership_Status() throws Throwable {
	   register.setState("Maharashtra");
	   register.clickNext();
	}

	@Then("^'Please Select MemeberShip status' message should display$")
	public void please_Select_MemeberShip_status_message_should_display() throws Throwable {
		String expectedMessage="Please Select MemeberShip status";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next by entering all valid details$")
	public void user_will_click_on_next_by_entering_all_valid_details() throws Throwable {
		List<String> c=new ArrayList<String>();
		c.add("Java");
		c.add("C#");
		register.setCouse(c);
	   register.setMemberstatus("member");
	   register.clickNext();
	}

	@Then("^'Personal details are validated\\.' message should display$")
	public void personal_details_are_validated_message_should_display() throws Throwable {
		String expectedMessage="Personal details are validated.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		
	}

	@Then("^navigates to the payment page$")
	public void navigates_to_the_payment_page() throws Throwable {
		driver.switchTo().alert().dismiss();
	}

	@When("^user is on payement page$")
	public void user_is_on_payement_page() throws Throwable {

	}

	@Then("^conference registration page should load with tile 'Payment Details'$")
	public void conference_registration_page_should_load_with_tile_Payment_Details() throws Throwable {
		String expectedTitle="Payment Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user clicks on make payment without entering Card Holder Name$")
	public void user_clicks_on_make_payment_without_entering_Card_Holder_Name() throws Throwable {
	  details.setHname("");
	  details.clickSubmit();
	}

	@Then("^'Please fill the Card holder name' message should display$")
	public void please_fill_the_Card_holder_name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on make payment without entering Debit Card Number$")
	public void user_clicks_on_make_payment_without_entering_Debit_Card_Number() throws Throwable {
		details.setHname("jagan");
		   details.clickSubmit();
	}

	@Then("^'Please fill the Debit card Number' message should display$")
	public void please_fill_the_Debit_card_Number_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on make payment without entering Expiration month$")
	public void user_clicks_on_make_payment_without_entering_Expiration_month() throws Throwable {
	    details.setDebit("125478963");
	    details.setCvv("222");
	    details.clickSubmit();
	}

	@Then("^'Please fill expiration month' message should display$")
	public void please_fill_expiration_month_message_should_display() throws Throwable {
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	    	}

	@When("^user clicks on make payment without entering Expiration year$")
	public void user_clicks_on_make_payment_without_entering_Expiration_year() throws Throwable {
	   
		details.setMonth("12");
	   details.clickSubmit();
	}

	@Then("^'Please fill the expiration year' message should display$")
	public void please_fill_the_expiration_year_message_should_display() throws Throwable {
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on make payment with valid details$")
	public void user_clicks_on_make_payment_with_valid_details() throws Throwable {
	   details.setYear("2018");
	   details.clickSubmit();
	}

	@Then("^'Conference Room Booking successfully done!!!' message should display$")
	public void conference_Room_Booking_successfully_done_message_should_display() throws Throwable {
		String expectedMessage="Conference Room Booking successfully done!!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		driver.close();
	}
}
