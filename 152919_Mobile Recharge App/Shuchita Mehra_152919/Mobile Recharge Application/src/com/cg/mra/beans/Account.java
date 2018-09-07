package com.cg.mra.beans;
/**
 * 
 * Class name: Account
 * Number of Methods: 8
 * Number of constructor:1
 * Name of constructor: Account(String mobileNo, String accountType, String customerName, double accountBalance)
 * Purpose: This is the bean class that contains the template for the account Details
 * Name of methods: setMobileNo(String mobileNo),String getMobileNo(),String getAccountType(),
 *                  setAccountType(String accountType), String getCustomerName(),setCustomerName(String customerName),
 *                  double getAccountBalance(),setAccountBalance(double accountBalance)
 * Author: Shuchita
 * Date of creation: 11.7.2018
 * 
 *
 */
public class Account {
	private String mobileNo;
	private String accountType;
	private String customerName;
	private double accountBalance;
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Account(String mobileNo, String accountType, String customerName,
			double accountBalance) {
		super();
		this.mobileNo = mobileNo;
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
	
	

}
