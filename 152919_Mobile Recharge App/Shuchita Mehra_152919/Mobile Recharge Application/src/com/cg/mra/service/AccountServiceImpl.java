package com.cg.mra.service;

import com.cg.mra.beans.Account;
/**
 * 
 * Class name: AccountServiceImpl
 * Number of Interface:1
 * Name of Interface: AccountService
 * Number of Methods: 4
 * Number of constructor:0
 * Purpose: This is the business layer class for  validation of the data and 
 *         passing the data to the DAO layer
 * Name of methods:Account getAccountDetails(String mobileNo), int rechargeAccount(String mobileNo, double rechargeAmount),
 *                 int rechargeAccount(String mobileNo,double rechargeAmount),boolean validateRechargeAmt(int rechargeAmt)
 * Author: Shuchita
 * Date of creation: 11.7.2018
 * 
 *
 */
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImp;
import com.cg.mra.exception.AccountException;

public class AccountServiceImpl implements AccountService {
	AccountDao accDao = new AccountDaoImp();
	
	/**
	 * This method takes the mobile number as input
	 * It sends the input to the Dao layer and
	 * returns the new updated balance to the service layer
	 */
	@Override
	public Account getAccountDetails(String mobileNo)
			throws AccountException {

		return accDao.getAccountDetails(mobileNo);
	}
	/**
	 * This method validates the mobile number.
	 * If the mobile number is not number or if the mobile number does not 
	 * contain 10 digits, it will throws an exception
	 * Else it returns true and number entered is validated
	 */

	@Override
	public boolean validateMobileNo(String mobileNo)
			throws AccountException {

		if (!mobileNo.matches("\\d{10}")) {
			throw new AccountException(
					"The mobile No must conatain 10 digits.");
		}

		return true;
	}
	/**
	 * This method takes the mobile number and the recharge amount as input
	 * It sends the input to the Dao layer and
	 * returns the new updated balance to the service layer
	 */
	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount)
			throws AccountException {
		
		return accDao.rechargeAccount(mobileNo, rechargeAmount);
	}

	/**
	 * This method validates the recharged amount.
	 * If the recharged amount is less than 0, it will throws an exception
	 * Else it returns true and recharged amount entered is validated
	 */
	@Override
	public boolean validateRechargeAmt(int rechargeAmt) throws AccountException{
		if(rechargeAmt<=0){
		throw new AccountException("The recharge amount should be greater than 0.");
		}
		return true;
	}

	
	

	

}
