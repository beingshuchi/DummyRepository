package com.cg.registration.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.canvas.ext.WEBGL_compressed_texture_s3tc;

public class ConferenceRegistrationPage {
	
	@FindBy(how=How.NAME, name="txtFN")
	private WebElement firstname;
	
	@FindBy(how=How.NAME, name="txtLN")
	private WebElement lastname;
	
	@FindBy(how=How.NAME, name="Email")
	private WebElement email;
	
	@FindBy(how=How.NAME, name="Phone")
	private WebElement contactNo;
	
	@FindBy(name = "size")
	public List<WebElement> sel;
	
	@FindBy(how=How.NAME, name="Address")
	private WebElement address;
	
	@FindBy(how=How.NAME, name="Address2")
	private WebElement area;
	
	@FindBy(name="city")
	public List<WebElement> city;
	
	@FindBy(name="state")
	public List<WebElement> state;
	
	@FindBy(name="course")
	public List<WebElement> course;
	
	@FindBy(name="memberStatus")
	public List<WebElement> memberStatus;
	
	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[15]/td/a")
	public WebElement next;


	public ConferenceRegistrationPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return this.firstname.getAttribute("firstname");
	}

	public void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}

	public String getLastname() {
		return this.lastname.getAttribute("lastname");
	}

	public void setLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}

	public String getEmail() {
		return this.email.getAttribute("email");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getContactNo() {
		return this.contactNo.getAttribute("contactNo");
	}

	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}

	public void setSel(String sel) {
		Select select = new Select(this.sel.get(0));
	    select.selectByVisibleText(sel);
	}

	public String getAddress() {
		return this.address.getAttribute("address");
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public String getArea() {
		return this.area.getAttribute("area");
	}

	public void setArea(String area) {
		this.area.sendKeys(area);
	}

	public void setCity(String city) {
		Select select = new Select(this.city.get(0));
	    select.selectByVisibleText(city);
	}


	public void setState(String state) {
		Select select = new Select(this.state.get(0));
	    select.selectByVisibleText(state);
	}
	public void setCouse(List<String> course) {
		for(WebElement c : this.course) {
			for(String c1 : course) {
			if(c.getAttribute("value").contains(c1))
				c.click();
		}	
		}
	}

	public void setMemberstatus(String memberstatus) {
		for(WebElement status : memberStatus) {
			if(status.getAttribute("value").contains(memberstatus))
				status.click();
		}	
	}
	
	public void clickNext() {
		 next.click();
	}
	
	
}
