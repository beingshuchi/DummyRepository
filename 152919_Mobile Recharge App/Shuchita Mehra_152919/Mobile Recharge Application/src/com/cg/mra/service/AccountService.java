package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;
/**
 * 
 * Interface name: AccountService
 * Number of abstract Methods: 4
 * Name of method: Account getAccountDetails(String mobileNo),
 *                      int rechargeAccount(String mobileNo,double rechargeAmount),
 *                      boolean validateMobileNo(String mobileNo),boolean validateRechargeAmt(int rechargeAmt)
 * Purpose: This is the interface of service class to be implemented
 * 
 * Author: Shuchita
 * Date of creation: 11.7.2018
 */
public interface AccountService {
	Account getAccountDetails(String mobileNo)throws AccountException;
	boolean validateMobileNo(String mobileNo)throws AccountException;
	int rechargeAccount(String mobileNo,double rechargeAmount)throws AccountException;
	boolean validateRechargeAmt(int rechargeAmt) throws AccountException;
}
