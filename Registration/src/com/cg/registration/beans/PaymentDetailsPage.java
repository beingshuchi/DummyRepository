package com.cg.registration.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetailsPage {
	
	@FindBy(how=How.NAME, name="txtFN")
	private WebElement Hname;
	
	@FindBy(how=How.NAME, name="debit")
	private WebElement debit;
	
	@FindBy(how=How.NAME, name="cvv")
	private WebElement cvv;
	
	@FindBy(how=How.NAME, name="month")
	private WebElement month;
	
	@FindBy(how=How.NAME, name="year")
	private WebElement year;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"btnPayment\"]")
	private WebElement submit;

	public String getHname() {
		return this.Hname.getAttribute("Hname");
	}



	public String getDebit() {
		return this.debit.getAttribute("debit");
	}



	public String getCvv() {
		return this.cvv.getAttribute("cvv");
	}



	public String getMonth() {
		return this.month.getAttribute("month");
	}



	public String getYear() {
		return this.year.getAttribute("year");
	}



	public PaymentDetailsPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void setHname(String hname) {
		this.Hname.sendKeys(hname);
	}

	
	public void setDebit(String debit) {
		this.debit.sendKeys(debit);
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	
	public void setMonth(String month) {
		this.month.sendKeys(month);
	}

	

	public void setYear(String year) {
		this.year.sendKeys(year);
	}
	
	public void clickSubmit() {
		 submit.click();
	}
	
}
