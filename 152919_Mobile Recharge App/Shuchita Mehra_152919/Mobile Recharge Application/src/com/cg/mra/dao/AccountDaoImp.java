package com.cg.mra.dao;

import java.util.HashMap;



import com.cg.mra.beans.Account;
import com.cg.mra.db.AccountDB;
import com.cg.mra.exception.AccountException;

/**
 * 
 * Class name: AccountDaoImpl
 * Number of Interface:1
 * Name of Interface: AccountDao
 * Number of Methods: 2
 * Number of constructor:0
 * Purpose: This is the Dao layer class for  manipulation and updation to be done on the database
 * Name of methods:Account getAccountDetails(String mobileNo), int rechargeAccount(String mobileNo, double rechargeAmount),
 * Author: Shuchita
 * Date of creation: 11.7.2018
 * 
 *
 */

public class AccountDaoImp implements AccountDao {
	/*
	 * Creating a static hashMap to retrieve the data from the database class
	 * */
	static HashMap<String, Account> accMap=AccountDB.getCustomerData(); 

	/**
	 * This methods takes the mobile number as the input.
	 * It checks whether the given mobile number exists or not in the database
	 * If it does not exists it will throw an exception
	 * Else it will return the Account details to the service layer
	 */
	@Override
	public Account getAccountDetails(String mobileNo)throws AccountException {
		Account ac= accMap.get(mobileNo);
		if(ac==null){
			throw new AccountException("ERROR: Given Account Id Does Not Exists");
		}
		return ac;
	}
	/**
	 * This method takes the mobile number and the recharge amount as input
	 * It checks first of the mobile number exists on the database or not
	 * If it does not exists it will throw an exception
	 * Else it updates the database by adding the recharge amount to the current balance and
	 * returns the new updated balance to the service layer
	 */
	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) throws AccountException {
		Account ac=accMap.get(mobileNo);
		double newAccountBalance;
		if(ac==null){
			throw new AccountException("ERROR: Cannot Recharge Account as Given MobileNo Does Not Exists");
		}
		else{
			newAccountBalance=ac.getAccountBalance()+rechargeAmount;
			ac.setAccountBalance(newAccountBalance);
			accMap.replace(mobileNo, ac);
		}
		return (int) newAccountBalance;
	}

}
