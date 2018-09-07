package com.cg.mra.dao;
import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;

/**
 * 
 * Interface name: AccountDao
 * Number of abstract Methods: 2
 * Name of method: Account getAccountDetails(String mobileNo),
 *                      int rechargeAccount(String mobileNo,double rechargeAmount)
 * Purpose: This is the interface of dao to be implemented
 * 
 * Author: Shuchita
 * Date of creation: 11.7.2018
 */
public interface AccountDao {
	Account getAccountDetails(String mobileNo)throws AccountException;
	int rechargeAccount(String mobileNo,double rechargeAmount)throws AccountException;
}
